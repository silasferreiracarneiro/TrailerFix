package com.example.trailerfix.di.component

import android.app.Application
import android.content.Context
import com.example.trailerfix.App
import com.example.trailerfix.data.config.FirebaseConfigContract
import com.example.trailerfix.data.prefs.PreferencesHelper
import com.example.trailerfix.di.ApplicationContext
import com.example.trailerfix.di.module.PresenterModule
import com.example.trailerfix.di.module.ApplicationModule
import com.example.trailerfix.di.module.DataModule
import com.example.trailerfix.di.module.InteractorModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class,
    PresenterModule::class,
    InteractorModule::class,
    DataModule::class
])
interface ApplicationComponent {

    fun inject(app: App)

    @ApplicationContext
    fun context(): Context

    fun preferencesHelper(): PreferencesHelper

    fun application(): Application

    fun firebaseConfig(): FirebaseConfigContract
}