package com.kariba.dependencyinjectionpractice

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                              @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUser(email: String, password : String){
        userRepository.saveUser(email, password)
        notificationService.send("kariba@gmail.com","User Registered")
    }
}

/*
* Unit Testing
* Single Responsibility
* Lifetime of these objects
* Extensible
* */