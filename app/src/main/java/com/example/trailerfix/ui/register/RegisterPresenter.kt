package com.example.trailerfix.ui.register

import com.example.trailerfix.ui.base.BasePresenter
import javax.inject.Inject

class RegisterPresenter<V: RegisterContract.View, I: RegisterContract.Interactor>
@Inject constructor(var interactorRegister: I):
    BasePresenter<V, I>(interactorRegister), RegisterContract.Presenter<V, I> {
}