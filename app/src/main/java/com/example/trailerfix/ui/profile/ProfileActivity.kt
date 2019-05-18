package com.example.trailerfix.ui.profile

import android.os.Bundle
import com.example.trailerfix.R
import com.example.trailerfix.ui.base.BaseActivity
import javax.inject.Inject

class ProfileActivity : BaseActivity(), ProfileContract.View {

    @Inject
    lateinit var presenter : ProfileContract.Presenter<ProfileContract.View, ProfileContract.Interactor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        getActivityComponent().inject(this)
        presenter.onAttach(this)
    }
}
