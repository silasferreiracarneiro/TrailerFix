package com.example.trailerfix.ui.login

import com.example.trailerfix.data.firebase.contract.ApiServiceFirebaseContract
import com.example.trailerfix.domain.User
import com.example.trailerfix.ui.base.BaseInteractor

class LoginInteractor(var firebaseApi: ApiServiceFirebaseContract): BaseInteractor(), LoginContract.Interactor {

    override fun login(user: User) {
        this.firebaseApi.loginUser(user)
    }
}