package com.example.trailerfix.di.module

import androidx.appcompat.app.AppCompatActivity
import com.example.trailerfix.data.firebase.contract.ApiServiceFirebaseContract
import com.example.trailerfix.di.PerActivity
import com.example.trailerfix.ui.accountlist.AccountListContract
import com.example.trailerfix.ui.accountlist.AccountListInteractor
import com.example.trailerfix.ui.home.HomeContract
import com.example.trailerfix.ui.home.HomeInteractor
import com.example.trailerfix.ui.login.LoginContract
import com.example.trailerfix.ui.login.LoginInteractor
import com.example.trailerfix.ui.profile.ProfileContract
import com.example.trailerfix.ui.profile.ProfileInteractor
import com.example.trailerfix.ui.register.RegisterContract
import com.example.trailerfix.ui.register.RegisterInteractor
import dagger.Module
import dagger.Provides

@Module
class InteractorModule(var appCompatActivity: AppCompatActivity) {

    @Provides
    @PerActivity
    fun provideRegister(): RegisterContract.Interactor = RegisterInteractor()

    @Provides
    @PerActivity
    fun provideLogin(api: ApiServiceFirebaseContract): LoginContract.Interactor = LoginInteractor(api)

    @Provides
    @PerActivity
    fun provideHome(): HomeContract.Interactor = HomeInteractor()

    @Provides
    @PerActivity
    fun provideEditProfile(): ProfileContract.Interactor = ProfileInteractor()

    @Provides
    @PerActivity
    fun provideAccountList(): AccountListContract.Interactor = AccountListInteractor()

}