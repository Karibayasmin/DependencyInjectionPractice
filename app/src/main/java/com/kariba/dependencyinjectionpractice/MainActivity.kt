package com.kariba.dependencyinjectionpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()

        val userRegistrationService = component.getUserRegistrationService()
        var emailService = component.getEmailService()

        userRegistrationService.registerUser("karibayasmin@gmail.com", "1234")

    }
}