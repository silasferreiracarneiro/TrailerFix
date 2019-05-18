package com.example.trailerfix.ui.base

import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.trailerfix.utils.DialogHelper
import com.example.trailerfix.utils.NetworkHelper

abstract class BaseFragment : Fragment(), MvpView {

    private var mActivity: BaseActivity? = null
    private var mProgressDialog: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp(view)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is BaseActivity) {
            this.mActivity = context
            context.onFragmentAttached()
        }
    }

    override fun showLoading() {
        hideLoading()
        mProgressDialog = DialogHelper().showLoadingDialog(context!!)
    }

    override fun hideLoading() {
        if (mProgressDialog != null && mProgressDialog?.isShowing!!) {
            mProgressDialog?.cancel()
        }
    }

    override fun showMessage(message: String) {
        if (mActivity != null) {
            mActivity?.showMessage(message)
        }
    }

    override fun showMessage(id: Int) {
        if (mActivity != null) {
            mActivity?.showMessage(getString(id))
        }
    }

    override fun onGetString(id: Int): String {
        return getString(id)
    }

    override fun onFinish() {
        if(mActivity != null){
            mActivity?.onFinish()
        }
    }

    override fun isNetworkConnected(): Boolean {
        return NetworkHelper.isNetworkConnected(context!!)
    }

    override fun onDetach() {
        mActivity = null
        super.onDetach()
    }

    fun onFragmentAttached(){}

    fun onFragmentDetached(tag: String){}

    protected abstract fun setUp(view: View)

    interface Callback {
        fun onFragmentAttached()
        fun onFragmentDetached(tag: String)
    }
}