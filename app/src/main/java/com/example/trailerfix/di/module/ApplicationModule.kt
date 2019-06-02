package com.example.trailerfix.di.module

import android.app.Application
import android.content.Context
import com.example.trailerfix.data.config.FirebaseConfig
import com.example.trailerfix.data.config.FirebaseConfigContract
import com.example.trailerfix.data.prefs.AppPreferencesHelper
import com.example.trailerfix.data.prefs.PreferencesHelper
import com.example.trailerfix.di.ApplicationContext
import com.example.trailerfix.di.PreferenceInfo
import com.example.trailerfix.utils.AppConstant
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(val application: Application) {

    @Provides
    @ApplicationContext
    fun provideContext(): Context {
        return application
    }

    @Provides
    fun provideApplication(): Application {
        return application
    }

    @Provides
    @PreferenceInfo
    fun providePreferenceName(): String {
        return AppConstant.PREF_NAME
    }

    @Provides
    @Singleton
    fun providePreferencesHelper(appPreferencesHelper: AppPreferencesHelper): PreferencesHelper {
        return appPreferencesHelper
    }

    @Provides
    @Singleton
    fun provideFirebaseInstace(): FirebaseConfigContract {
        return FirebaseConfig()
    }
}