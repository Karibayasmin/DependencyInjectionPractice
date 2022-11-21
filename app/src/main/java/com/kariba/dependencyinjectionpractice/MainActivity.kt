package com.kariba.dependencyinjectionpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kariba.dependencyinjectionpractice.di.component.DaggerUserRegistrationComponent
import com.kariba.dependencyinjectionpractice.di.module.NotificationServiceModule
import com.kariba.dependencyinjectionpractice.di.service.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService : UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.factory().create(3)

        component.injectDependency(this)
        userRegistrationService.registerUser("karibayasmin@gmail.com", "1234")

    }
}