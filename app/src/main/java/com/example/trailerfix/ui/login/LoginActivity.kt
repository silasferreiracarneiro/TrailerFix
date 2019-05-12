package com.example.trailerfix.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trailerfix.R
import com.example.trailerfix.ui.home.HomeActivity
import com.example.trailerfix.ui.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        txtCadastre.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
