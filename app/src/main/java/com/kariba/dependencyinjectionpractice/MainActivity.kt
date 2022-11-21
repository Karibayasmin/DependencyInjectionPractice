package com.kariba.dependencyinjectionpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kariba.dependencyinjectionpractice.di.component.DaggerUserRegistrationComponent
import com.kariba.dependencyinjectionpractice.di.service.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService : UserRegistrationService

    @Inject
    lateinit var emailService : EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as UserApplication).appComponent

        val userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3, appComponent)
        userRegistrationComponent.injectDependency(this)

        userRegistrationService.registerUser("karibayasmin@gmail.com", "1234")

    }
}