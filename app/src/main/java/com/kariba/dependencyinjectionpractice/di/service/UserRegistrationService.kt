package com.kariba.dependencyinjectionpractice.di.service

import com.kariba.dependencyinjectionpractice.di.annotation.MessageQualifier
import com.kariba.dependencyinjectionpractice.NotificationService
import com.kariba.dependencyinjectionpractice.UserRepository
import javax.inject.Inject

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