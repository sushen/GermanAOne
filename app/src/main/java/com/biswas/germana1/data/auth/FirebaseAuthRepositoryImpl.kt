package com.biswas.germana1.data.auth

import com.biswas.germana1.domain.auth.AuthRepository
import com.biswas.germana1.domain.auth.AuthResult
import com.biswas.germana1.domain.auth.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await

class FirebaseAuthRepositoryImpl(
    private val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
) : AuthRepository {

    override val currentUser: Flow<User?> = callbackFlow {
        val listener = FirebaseAuth.AuthStateListener { auth ->
            trySend(auth.currentUser?.toDomainUser())
        }
        firebaseAuth.addAuthStateListener(listener)
        awaitClose { firebaseAuth.removeAuthStateListener(listener) }
    }

    override suspend fun login(email: String, password: String): AuthResult<User> {
        return try {
            val result = firebaseAuth.signInWithEmailAndPassword(email, password).await()
            val user = result.user?.toDomainUser()
            if (user != null) {
                AuthResult.Success(user)
            } else {
                AuthResult.Error("Failed to authenticate user.")
            }
        } catch (e: Exception) {
            AuthResult.Error(e.localizedMessage ?: "An error occurred during login.", e)
        }
    }

    override suspend fun register(email: String, password: String): AuthResult<User> {
        return try {
            val result = firebaseAuth.createUserWithEmailAndPassword(email, password).await()
            val user = result.user?.toDomainUser()
            if (user != null) {
                AuthResult.Success(user)
            } else {
                AuthResult.Error("Failed to create account.")
            }
        } catch (e: Exception) {
            AuthResult.Error(e.localizedMessage ?: "An error occurred during registration.", e)
        }
    }

    override suspend fun logout() {
        firebaseAuth.signOut()
    }

    override fun getCurrentUser(): User? {
        return firebaseAuth.currentUser?.toDomainUser()
    }

    private fun FirebaseUser.toDomainUser(): User {
        return User(
            uid = uid,
            email = email,
            displayName = displayName,
            isAnonymous = isAnonymous
        )
    }
}
