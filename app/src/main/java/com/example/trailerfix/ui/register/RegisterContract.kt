package com.example.trailerfix.ui.register

import com.example.trailerfix.domain.User
import com.example.trailerfix.ui.base.MvpInteractor
import com.example.trailerfix.ui.base.MvpPresenter
import com.example.trailerfix.ui.base.MvpView

interface RegisterContract {

    interface View: MvpView {
        fun getAccountList()
    }

    interface Presenter<V: RegisterContract.View, I: RegisterContract.Interactor>: MvpPresenter<V, I> {
        fun register(name: String, email: String, password: String)
    }

    interface Interactor: MvpInteractor {
        fun register(user: User)
    }
}