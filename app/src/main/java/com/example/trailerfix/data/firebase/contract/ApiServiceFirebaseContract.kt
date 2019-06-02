package com.example.trailerfix.data.firebase.contract

import com.example.trailerfix.domain.User

interface ApiServiceFirebaseContract {

    fun saveUser(user: User)
    fun loginUser(user: User)
}