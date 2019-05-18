package com.example.trailerfix.ui.register

import com.example.trailerfix.ui.base.MvpInteractor
import com.example.trailerfix.ui.base.MvpPresenter
import com.example.trailerfix.ui.base.MvpView

interface RegisterContract {

    interface View: MvpView {

    }

    interface Presenter<V: RegisterContract.View, I: RegisterContract.Interactor>: MvpPresenter<V, I> {

    }

    interface Interactor: MvpInteractor {

    }
}