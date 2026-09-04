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

    override suspend fun loginAsGuest(): AuthResult<User> {
        return try {
            val result = firebaseAuth.signInAnonymously().await()
            val user = result.user?.toDomainUser()
            if (user != null) {
                AuthResult.Success(user)
            } else {
                // Fallback for guest mode without Firebase backend connection
                val guestUser = User(uid = "guest_temp_uid", email = "guest@germana1.app", displayName = "Guest Learner", isAnonymous = true)
                AuthResult.Success(guestUser)
            }
        } catch (e: Exception) {
            // Local fallback if Firebase auth is offline or not configured
            val guestUser = User(uid = "guest_temp_uid", email = "guest@germana1.app", displayName = "Guest Learner", isAnonymous = true)
            AuthResult.Success(guestUser)
        }
    }

    override suspend fun logout() {
        try {
            firebaseAuth.signOut()
        } catch (e: Exception) {
            // Ignored if offline
        }
    }

    override fun getCurrentUser(): User? {
        return firebaseAuth.currentUser?.toDomainUser()
    }

    private fun FirebaseUser.toDomainUser(): User {
        return User(
            uid = uid,
            email = email,
            displayName = displayName ?: if (isAnonymous) "Guest Learner" else null,
            isAnonymous = isAnonymous
        )
    }
}
