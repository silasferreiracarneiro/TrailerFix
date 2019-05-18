package com.example.trailerfix.ui.accountlist

import com.example.trailerfix.ui.base.BasePresenter
import javax.inject.Inject

class AccountListPresenter<V: AccountListContract.View, I: AccountListContract.Interactor>
@Inject constructor(var interactorAccountList: I):
    BasePresenter<V, I>(interactorAccountList), AccountListContract.Presenter<V, I> {
}