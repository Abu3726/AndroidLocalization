package com.conamobile.androidlocalization

import android.app.Application


class MyApplication: Application() {
    companion object{
        val TAG = MyApplication::class.java.simpleName
        var instance: MyApplication? = null
        var localManager: LocaleManager? = null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        localManager = LocaleManager(this)
        localManager!!.setLocale(this)
    }
}