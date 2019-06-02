package com.example.trailerfix.ui.login

import com.example.trailerfix.domain.User
import com.example.trailerfix.ui.base.MvpInteractor
import com.example.trailerfix.ui.base.MvpPresenter
import com.example.trailerfix.ui.base.MvpView

interface LoginContract {

    interface View: MvpView {
        fun goHome()
    }

    interface Presenter<V: LoginContract.View, I: LoginContract.Interactor>: MvpPresenter<V, I> {
        fun login(email: String, password: String)
    }

    interface Interactor: MvpInteractor {
        fun login(user: User)
    }
}