package com.biswas.germana1.domain.auth

data class User(
    val uid: String,
    val email: String?,
    val displayName: String? = null,
    val isAnonymous: Boolean = false
)
