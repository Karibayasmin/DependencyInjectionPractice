package com.kariba.dependencyinjectionpractice

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService() : UserRegistrationService
    fun getEmailService() : EmailService
}