package com.example.trailerfix.data.firebase.model

import com.example.trailerfix.data.base.BaseRepository
import com.example.trailerfix.data.config.FirebaseConfigContract
import com.example.trailerfix.data.firebase.contract.ApiServiceFirebaseContract
import com.example.trailerfix.domain.User

class ApiServiceFirebase(var firebaseConfig: FirebaseConfigContract): BaseRepository(), ApiServiceFirebaseContract {

    override fun loginUser(user: User) {

    }

    override fun saveUser(user: User) {

    }
}