package com.example.sampledaggerapplication.di

import android.content.Context
import android.content.SharedPreferences
import android.content.res.Resources
import com.example.sampledaggerapplication.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule(var application: MyApplication) {

    @Singleton
    @Provides
    internal fun providesContext():Context{
        return application
    }

    @Singleton
    @Provides
    internal fun provideSharedPref(context: Context):SharedPreferences{
        return context.getSharedPreferences("Shared_Pref",Context.MODE_PRIVATE)
    }

    @Singleton
    @Provides
    internal fun provideResources(context: Context):Resources{
        return context.resources
    }

}