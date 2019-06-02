package com.example.trailerfix.ui.register

import com.example.trailerfix.domain.User
import com.example.trailerfix.ui.base.BasePresenter
import javax.inject.Inject

class RegisterPresenter<V: RegisterContract.View, I: RegisterContract.Interactor>
@Inject constructor(var interactorRegister: I):
    BasePresenter<V, I>(interactorRegister), RegisterContract.Presenter<V, I> {

    override fun register(name: String, email: String, password: String) {

        var user = User()
        user.name = name
        user.email = email
        user.password = password

        if(validateUser(user)){
            this.interactorRegister.register(user)
        }
    }

    private fun validateUser(user: User): Boolean {
        return true
    }
}