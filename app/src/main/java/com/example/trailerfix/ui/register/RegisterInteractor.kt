package com.example.trailerfix.ui.register

import com.example.trailerfix.data.firebase.contract.ApiServiceFirebaseContract
import com.example.trailerfix.domain.User
import com.example.trailerfix.ui.base.BaseInteractor

class RegisterInteractor(var api: ApiServiceFirebaseContract): BaseInteractor(), RegisterContract.Interactor {

    override fun register(user: User) {
        api.saveUser(user)
    }
}