package com.example.trailerfix.ui.home

import com.example.trailerfix.ui.base.MvpInteractor
import com.example.trailerfix.ui.base.MvpPresenter
import com.example.trailerfix.ui.base.MvpView

interface HomeContract {

    interface View: MvpView {

    }

    interface Presenter<V: HomeContract.View, I: HomeContract.Interactor>: MvpPresenter<V, I> {

    }

    interface Interactor: MvpInteractor {

    }
}