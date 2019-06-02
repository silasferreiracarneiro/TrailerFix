package com.example.trailerfix.data.firebase.model

import com.example.trailerfix.data.base.BaseRepository
import com.example.trailerfix.data.config.FirebaseConfigContract
import com.example.trailerfix.data.firebase.contract.ApiServiceFirebaseContract
import com.example.trailerfix.domain.User
import com.example.trailerfix.utils.AppConstant.Companion.USER
import com.example.trailerfix.utils.Base64Util

class ApiServiceFirebase(var firebaseConfig: FirebaseConfigContract): BaseRepository(), ApiServiceFirebaseContract {

    override fun loginUser(user: User) {

    }

    override fun saveUser(user: User) {
        firebaseConfig.authFirebase().createUserWithEmailAndPassword(user.email, user.password)
        firebaseConfig.database().child(USER).child(Base64Util.encode(user.email)).setValue(user)
    }
}