package com.biswas.germana1.domain.auth

import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    val currentUser: Flow<User?>

    suspend fun login(email: String, password: String): AuthResult<User>
    suspend fun register(email: String, password: String): AuthResult<User>
    suspend fun logout()
    fun getCurrentUser(): User?
}
