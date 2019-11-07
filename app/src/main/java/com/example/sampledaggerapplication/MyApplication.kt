package com.example.sampledaggerapplication

import android.app.Application
import com.example.sampledaggerapplication.di.AppComponents
import com.example.sampledaggerapplication.di.AppModule
import com.example.sampledaggerapplication.di.DaggerAppComponents

class MyApplication : Application() {

    companion object{
        var appComponents: AppComponents? = null
            private set
        private var instance: MyApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        appComponents=createComponent()
        appComponents!!.inject(this)
    }

    protected fun createComponent(): AppComponents {
        return DaggerAppComponents.builder().appModule(AppModule(this)).build()
    }

    fun getAppComponent(): AppComponents? {
        return appComponents
    }


}