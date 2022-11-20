package com.kariba.dependencyinjectionpractice

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                              private val emailService: EmailService
) {

    fun registerUser(email: String, password : String){
        userRepository.saveUser(email, password)
        emailService.send("kariba@gmail.com","User Registered")
    }
}

/*
* Unit Testing
* Single Responsibility
* Lifetime of these objects
* Extensible
* */