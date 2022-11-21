package com.kariba.dependencyinjectionpractice.di.component

import com.kariba.dependencyinjectionpractice.MainActivity
import com.kariba.dependencyinjectionpractice.di.annotation.ActivityScope
import com.kariba.dependencyinjectionpractice.di.annotation.ApplicationScope
import com.kariba.dependencyinjectionpractice.di.module.AnalyticsModule
import com.kariba.dependencyinjectionpractice.di.module.NotificationServiceModule
import com.kariba.dependencyinjectionpractice.di.module.UserRepositoryModule
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun injectDependency(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount: Int, appComponent: AppComponent): UserRegistrationComponent
    }
}