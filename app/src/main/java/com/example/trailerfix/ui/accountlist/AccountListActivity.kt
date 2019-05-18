package com.example.trailerfix.ui.accountlist

import android.os.Bundle
import com.example.trailerfix.R
import com.example.trailerfix.ui.base.BaseActivity
import javax.inject.Inject

class AccountListActivity : BaseActivity(), AccountListContract.View {

    @Inject
    lateinit var presenter : AccountListContract.Presenter<AccountListContract.View, AccountListContract.Interactor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_list)

        getActivityComponent().inject(this)
        presenter.onAttach(this)
    }
}
