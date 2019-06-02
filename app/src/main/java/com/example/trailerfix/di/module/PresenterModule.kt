package com.example.trailerfix.di.module

import androidx.appcompat.app.AppCompatActivity
import com.example.trailerfix.di.PerActivity
import com.example.trailerfix.ui.accountlist.AccountListContract
import com.example.trailerfix.ui.accountlist.AccountListPresenter
import com.example.trailerfix.ui.home.HomeContract
import com.example.trailerfix.ui.home.HomePresenter
import com.example.trailerfix.ui.login.LoginContract
import com.example.trailerfix.ui.login.LoginPresenter
import com.example.trailerfix.ui.profile.ProfileContract
import com.example.trailerfix.ui.profile.ProfilePresenter
import com.example.trailerfix.ui.register.RegisterContract
import com.example.trailerfix.ui.register.RegisterPresenter
import dagger.Module
import dagger.Provides

@Module
class PresenterModule(appCompatActivity: AppCompatActivity) {

    @Provides
    @PerActivity
    fun provideRegister(interactorRegister: RegisterContract.Interactor):
            RegisterContract.Presenter<RegisterContract.View, RegisterContract.Interactor> = RegisterPresenter(interactorRegister)

    @Provides
    @PerActivity
    fun provideLogin(interactor: LoginContract.Interactor):
            LoginContract.Presenter<LoginContract.View, LoginContract.Interactor> =  LoginPresenter(interactor)

    @Provides
    @PerActivity
    fun provideHome(interactor: HomeContract.Interactor):
            HomeContract.Presenter<HomeContract.View, HomeContract.Interactor> = HomePresenter(interactor)

    @Provides
    @PerActivity
    fun provideEditProfile(interactor: ProfileContract.Interactor):
            ProfileContract.Presenter<ProfileContract.View, ProfileContract.Interactor> = ProfilePresenter(interactor)

    @Provides
    @PerActivity
    fun provideAccountList(interactor: AccountListContract.Interactor):
            AccountListContract.Presenter<AccountListContract.View, AccountListContract.Interactor> = AccountListPresenter(interactor)

}