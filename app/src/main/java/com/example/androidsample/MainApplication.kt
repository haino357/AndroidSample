package com.example.androidsample

import android.app.Application
import timber.log.Timber
import timber.log.Timber.*

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        // Timberの用意
        Timber.plant(DebugTree())
    }


}