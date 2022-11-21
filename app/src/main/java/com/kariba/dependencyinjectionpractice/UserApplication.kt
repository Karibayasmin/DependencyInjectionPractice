package com.kariba.dependencyinjectionpractice

import android.app.Application
import com.kariba.dependencyinjectionpractice.di.component.DaggerUserRegistrationComponent
import com.kariba.dependencyinjectionpractice.di.component.UserRegistrationComponent

class UserApplication : Application() {

    lateinit var userRegistrationComponent : UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()

        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)

    }
}