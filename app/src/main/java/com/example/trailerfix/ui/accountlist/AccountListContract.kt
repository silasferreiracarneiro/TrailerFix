package com.example.trailerfix.ui.accountlist

import com.example.trailerfix.ui.base.MvpInteractor
import com.example.trailerfix.ui.base.MvpPresenter
import com.example.trailerfix.ui.base.MvpView

interface AccountListContract {

    interface View: MvpView {

    }

    interface Presenter<V: AccountListContract.View, I: AccountListContract.Interactor>: MvpPresenter<V, I> {

    }

    interface Interactor: MvpInteractor {

    }
}