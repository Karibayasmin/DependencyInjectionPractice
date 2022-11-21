package com.kariba.dependencyinjectionpractice.di.component

import com.kariba.dependencyinjectionpractice.MainActivity
import com.kariba.dependencyinjectionpractice.di.module.NotificationServiceModule
import com.kariba.dependencyinjectionpractice.di.module.UserRepositoryModule
import dagger.Binds
import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun injectDependency(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }
}