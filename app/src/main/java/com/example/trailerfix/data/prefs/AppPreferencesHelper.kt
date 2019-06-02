package com.example.trailerfix.data.prefs

import android.content.Context
import android.content.SharedPreferences
import com.example.trailerfix.di.ApplicationContext
import com.example.trailerfix.di.PreferenceInfo
import javax.inject.Inject

class AppPreferencesHelper  @Inject constructor(@ApplicationContext context: Context,
                                                @PreferenceInfo prefFileName: String): PreferencesHelper {

    private val mPrefs: SharedPreferences = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)

    override fun setFirstTime() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFirstTime() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}