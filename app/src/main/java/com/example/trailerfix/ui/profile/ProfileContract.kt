package com.example.trailerfix.ui.profile

import com.example.trailerfix.ui.base.MvpInteractor
import com.example.trailerfix.ui.base.MvpPresenter
import com.example.trailerfix.ui.base.MvpView

interface ProfileContract {

    interface View: MvpView {

    }

    interface Presenter<V: ProfileContract.View, I: ProfileContract.Interactor>: MvpPresenter<V, I> {

    }

    interface Interactor: MvpInteractor {

    }
}