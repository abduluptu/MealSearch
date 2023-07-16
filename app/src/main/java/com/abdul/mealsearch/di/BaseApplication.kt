package com.abdul.mealsearch.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//create application to configure the hilt in the application

@HiltAndroidApp
class BaseApplication : Application() {
}