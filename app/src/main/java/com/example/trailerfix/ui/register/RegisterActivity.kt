package com.example.trailerfix.ui.register

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.trailerfix.R
import com.example.trailerfix.ui.accountlist.AccountListActivity
import com.example.trailerfix.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_register.*
import javax.inject.Inject

class RegisterActivity : BaseActivity(), RegisterContract.View {

    @Inject
    lateinit var presenter : RegisterContract.Presenter<RegisterContract.View, RegisterContract.Interactor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        getActivityComponent().inject(this)
        presenter.onAttach(this)

    }

    override fun getAccountList() {
        startActivity(Intent(this, AccountListActivity::class.java))
    }

    fun saveProfile(view: View){
        var name = edtNome?.text.toString()
        var email = edtEmail?.text.toString()
        var password = extPassword?.text.toString()

        this.presenter.register(name, email, password)
    }
}
