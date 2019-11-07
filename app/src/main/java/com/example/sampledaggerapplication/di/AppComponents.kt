package com.example.sampledaggerapplication.di

import com.example.sampledaggerapplication.MainActivity
import com.example.sampledaggerapplication.MyApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules =[AppModule::class])
interface AppComponents {

    fun inject(application: MyApplication)
    fun inject(mainActivity: MainActivity)
}