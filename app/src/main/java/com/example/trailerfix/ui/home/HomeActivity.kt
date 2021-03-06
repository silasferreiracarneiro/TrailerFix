package com.example.trailerfix.ui.home

import android.os.Bundle
import com.example.trailerfix.R
import com.example.trailerfix.ui.base.BaseActivity
import javax.inject.Inject

class HomeActivity : BaseActivity(), HomeContract.View {

    @Inject
    lateinit var presenter : HomeContract.Presenter<HomeContract.View, HomeContract.Interactor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        getActivityComponent().inject(this)
        presenter.onAttach(this)
    }
}
