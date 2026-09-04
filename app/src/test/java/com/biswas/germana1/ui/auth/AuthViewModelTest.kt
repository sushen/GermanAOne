package com.biswas.germana1.ui.auth

import com.biswas.germana1.domain.auth.AuthRepository
import com.biswas.germana1.domain.auth.AuthResult
import com.biswas.germana1.domain.auth.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class FakeAuthRepository : AuthRepository {
    private val _currentUser = MutableStateFlow<User?>(null)
    override val currentUser: Flow<User?> = _currentUser

    var shouldReturnError = false

    override suspend fun login(email: String, password: String): AuthResult<User> {
        if (shouldReturnError) {
            return AuthResult.Error("Invalid credentials")
        }
        val user = User(uid = "test_uid", email = email)
        _currentUser.value = user
        return AuthResult.Success(user)
    }

    override suspend fun register(email: String, password: String): AuthResult<User> {
        if (shouldReturnError) {
            return AuthResult.Error("Registration failed")
        }
        val user = User(uid = "test_uid", email = email)
        _currentUser.value = user
        return AuthResult.Success(user)
    }

    override suspend fun loginAsGuest(): AuthResult<User> {
        if (shouldReturnError) {
            return AuthResult.Error("Guest login failed")
        }
        val user = User(uid = "guest_uid", email = "guest@germana1.app", displayName = "Guest Learner", isAnonymous = true)
        _currentUser.value = user
        return AuthResult.Success(user)
    }

    override suspend fun logout() {
        _currentUser.value = null
    }

    override fun getCurrentUser(): User? = _currentUser.value
}

@OptIn(ExperimentalCoroutinesApi::class)
class AuthViewModelTest {

    private val testDispatcher = StandardTestDispatcher()
    private lateinit var fakeAuthRepository: FakeAuthRepository
    private lateinit var viewModel: AuthViewModel

    @Before
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
        fakeAuthRepository = FakeAuthRepository()
        viewModel = AuthViewModel(fakeAuthRepository)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun login_emptyFields_setsErrorState() {
        viewModel.login("", "")
        assertTrue(viewModel.uiState.value is AuthUiState.Error)
        assertEquals("Email and password must not be empty.", (viewModel.uiState.value as AuthUiState.Error).message)
    }

    @Test
    fun login_success_updatesUiStateToSuccess() = runTest {
        viewModel.login("user@example.com", "password123")
        testDispatcher.scheduler.advanceUntilIdle()

        assertTrue(viewModel.uiState.value is AuthUiState.Success)
        assertEquals("user@example.com", (viewModel.uiState.value as AuthUiState.Success).user.email)
    }

    @Test
    fun loginAsGuest_success_updatesUiStateToSuccessWithAnonymousUser() = runTest {
        viewModel.loginAsGuest()
        testDispatcher.scheduler.advanceUntilIdle()

        assertTrue(viewModel.uiState.value is AuthUiState.Success)
        val user = (viewModel.uiState.value as AuthUiState.Success).user
        assertTrue(user.isAnonymous)
        assertEquals("Guest Learner", user.displayName)
    }

    @Test
    fun register_passwordsMismatch_orError_updatesState() = runTest {
        fakeAuthRepository.shouldReturnError = true
        viewModel.register("user@example.com", "password123")
        testDispatcher.scheduler.advanceUntilIdle()

        assertTrue(viewModel.uiState.value is AuthUiState.Error)
        assertEquals("Registration failed", (viewModel.uiState.value as AuthUiState.Error).message)
    }
}
