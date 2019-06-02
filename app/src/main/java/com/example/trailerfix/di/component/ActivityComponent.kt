package com.example.trailerfix.di.component

import com.example.trailerfix.di.PerActivity
import com.example.trailerfix.di.module.DataModule
import com.example.trailerfix.di.module.InteractorModule
import com.example.trailerfix.di.module.PresenterModule
import com.example.trailerfix.ui.accountlist.AccountListActivity
import com.example.trailerfix.ui.home.HomeActivity
import com.example.trailerfix.ui.login.LoginActivity
import com.example.trailerfix.ui.profile.ProfileActivity
import com.example.trailerfix.ui.register.RegisterActivity
import dagger.Component

@PerActivity
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [
        PresenterModule::class,
        InteractorModule::class,
        DataModule::class
    ])
interface ActivityComponent {

    fun inject(activity: LoginActivity)
    fun inject(activity: AccountListActivity)
    fun inject(activity: HomeActivity)
    fun inject(activity: ProfileActivity)
    fun inject(activity: RegisterActivity)
}