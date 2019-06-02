package com.example.trailerfix.ui.login

import android.content.Intent
import android.os.Bundle
import com.example.trailerfix.R
import com.example.trailerfix.ui.accountlist.AccountListActivity
import com.example.trailerfix.ui.base.BaseActivity
import com.example.trailerfix.ui.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : BaseActivity(), LoginContract.View {

    @Inject
    lateinit var presenter : LoginContract.Presenter<LoginContract.View, LoginContract.Interactor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        getActivityComponent().inject(this)
        presenter.onAttach(this)

        btnLogin.setOnClickListener {
            var email = edtEmail?.text.toString()
            var password = edtPassword?.text.toString()
            this.presenter.login(email, password)
        }

        txtCadastre.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    override fun goHome() {
        startActivity(Intent(this, AccountListActivity::class.java))
    }
}
