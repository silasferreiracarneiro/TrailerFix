package com.example.trailerfix.ui.base

interface MvpPresenter<V : MvpView, I : MvpInteractor> {

    fun getMvpView() : V

    fun getMvpInteractor() : I

    fun handleApiError(error: Exception)

    fun onAttach(mvpView : V)

    fun isViewAttached() : Boolean

    fun checkViewAttached()
}