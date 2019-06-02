package com.example.trailerfix.di.module

import androidx.appcompat.app.AppCompatActivity
import com.example.trailerfix.data.config.FirebaseConfigContract
import com.example.trailerfix.data.firebase.contract.ApiServiceFirebaseContract
import com.example.trailerfix.data.firebase.model.ApiServiceFirebase
import dagger.Module
import dagger.Provides

@Module
class DataModule (var appCompatActivity: AppCompatActivity) {

    @Provides
    fun provideApiService(api: FirebaseConfigContract): ApiServiceFirebaseContract {
        return ApiServiceFirebase(api)
    }
}