package com.kariba.dependencyinjectionpractice

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun injectDependency(mainActivity: MainActivity)
}