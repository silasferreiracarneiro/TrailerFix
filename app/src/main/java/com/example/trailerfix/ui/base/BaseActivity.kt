package com.example.trailerfix.ui.base

import android.app.ProgressDialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.trailerfix.App
import com.example.trailerfix.di.component.ActivityComponent
import com.example.trailerfix.di.component.DaggerActivityComponent
import com.example.trailerfix.di.module.DataModule
import com.example.trailerfix.di.module.InteractorModule
import com.example.trailerfix.di.module.PresenterModule
import com.example.trailerfix.utils.DialogHelper
import com.example.trailerfix.utils.NetworkHelper

abstract class BaseActivity: AppCompatActivity(), MvpView, BaseFragment.Callback {

     private var mProgressDialog: ProgressDialog? = null
     private lateinit var mActivityComponent: ActivityComponent

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

         mActivityComponent = DaggerActivityComponent.builder()
             .interactorModule(InteractorModule(this))
             .presenterModule(PresenterModule(this))
             .dataModule(DataModule(this))
             .applicationComponent((application as App).getComponent())
             .build()
     }

     override fun showLoading() {
         hideLoading()
         mProgressDialog = DialogHelper().showLoadingDialog(applicationContext)
     }

     override fun hideLoading() {
         if (mProgressDialog != null && mProgressDialog?.isShowing!!) {
             mProgressDialog?.cancel()
         }
     }

     override fun showMessage(message: String) {
         Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
     }

    override fun showMessage(id: Int) {
        showMessage(getString(id))
    }

     override fun onGetString(id: Int): String {
         return getString(id)
     }

     override fun onFinish() {
         this.finish()
     }

     override fun isNetworkConnected(): Boolean {
         return NetworkHelper.isNetworkConnected(applicationContext)
     }

     override fun onFragmentAttached() {
         TODO("not implemented")
     }

     override fun onFragmentDetached(tag: String) {
         TODO("not implemented")
     }

    fun getActivityComponent(): ActivityComponent {
        return mActivityComponent
    }
 }