package com.example.trailerfix.ui.profile

import com.example.trailerfix.ui.base.BasePresenter
import javax.inject.Inject

class ProfilePresenter<V: ProfileContract.View, I: ProfileContract.Interactor>
@Inject constructor(var interactorProfile: I):
    BasePresenter<V, I>(interactorProfile), ProfileContract.Presenter<V, I> {
}