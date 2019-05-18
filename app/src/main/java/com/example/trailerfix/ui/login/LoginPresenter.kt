package com.example.trailerfix.ui.login

import com.example.trailerfix.ui.base.BasePresenter
import javax.inject.Inject

class LoginPresenter<V: LoginContract.View, I: LoginContract.Interactor>
    @Inject constructor(var interactorLogin: I):
    BasePresenter<V, I>(interactorLogin), LoginContract.Presenter<V, I> {
}