package com.kariba.dependencyinjectionpractice

import android.app.Application
import com.kariba.dependencyinjectionpractice.di.component.AppComponent
import com.kariba.dependencyinjectionpractice.di.component.DaggerAppComponent
import com.kariba.dependencyinjectionpractice.di.component.UserRegistrationComponent

class UserApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()

    }
}