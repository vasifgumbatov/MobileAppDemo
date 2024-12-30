package com.vasifgumbatov.newapplication.ui

import android.util.Log

object CredentialsManager {
    private val credentialsMap = mutableMapOf<String, String>()

    fun register(email: String, password: String): Boolean {
        return if (credentialsMap.containsKey(email)) {
            Log.d("CredentialsManager", "Registration failed: Email $email already exists")
            false
        } else {
            credentialsMap[email] = password
            Log.d("CredentialsManager", "Registration successful: $email")
            true
        }
    }

    fun login(email: String, password: String): Boolean {
        val isValid = credentialsMap[email] == password
        Log.d("CredentialsManager", "Login attempt for $email: $isValid")
        return isValid
    }
}