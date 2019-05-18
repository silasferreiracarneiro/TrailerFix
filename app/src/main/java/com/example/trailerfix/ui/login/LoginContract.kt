package com.example.trailerfix.ui.login

import com.example.trailerfix.ui.base.MvpInteractor
import com.example.trailerfix.ui.base.MvpPresenter
import com.example.trailerfix.ui.base.MvpView

interface LoginContract {

    interface View: MvpView {

    }

    interface Presenter<V: LoginContract.View, I: LoginContract.Interactor>: MvpPresenter<V, I> {

    }

    interface Interactor: MvpInteractor {

    }
}