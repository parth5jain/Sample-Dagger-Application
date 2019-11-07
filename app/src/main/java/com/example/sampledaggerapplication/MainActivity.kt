package com.example.sampledaggerapplication

import android.content.Context
import android.content.SharedPreferences
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPref:SharedPreferences

    @Inject
    lateinit var context: Context

    @Inject
    lateinit var resource: Resources

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyApplication.appComponents?.inject(this)

        sharedPref.edit().putInt("Num",15).apply()

        Log.e("Preference Value", sharedPref.getInt("Num",0).toString())

        text.setBackgroundColor(context.resources.getColor(android.R.color.holo_purple))

        //
        Log.e("Preference color val",resource.getColor(android.R.color.holo_purple).toString())
    }
}
