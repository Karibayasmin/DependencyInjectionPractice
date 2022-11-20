package com.kariba.dependencyinjectionpractice

import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun injectDependency(mainActivity: MainActivity)
}