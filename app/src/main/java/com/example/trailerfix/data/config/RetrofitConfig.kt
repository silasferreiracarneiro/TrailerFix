package com.example.trailerfix.data.config

import com.example.trailerfix.data.network.ApiService
import com.example.trailerfix.utils.AppConstant.Companion.URL_BASE
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitConfig : RetrofitConfigContract {

    fun getIntanceRetrofit() = Retrofit.Builder()
        .baseUrl(URL_BASE)
        .client(OkHttpClient().newBuilder().build())
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    override val api: ApiService = getIntanceRetrofit().create(ApiService::class.java)
}