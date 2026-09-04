package com.biswas.germana1.domain.auth

sealed class AuthResult<out T> {
    data class Success<out T>(val data: T) : AuthResult<T>()
    data class Error(val message: String, val cause: Throwable? = null) : AuthResult<Nothing>()
    object Loading : AuthResult<Nothing>()
}
