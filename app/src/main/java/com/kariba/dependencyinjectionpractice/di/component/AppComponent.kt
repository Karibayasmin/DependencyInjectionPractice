package com.kariba.dependencyinjectionpractice.di.component

import com.kariba.dependencyinjectionpractice.di.module.AnalyticsModule
import com.kariba.dependencyinjectionpractice.di.service.AnalyticsService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getUserRegistrationComponentFactory() : UserRegistrationComponent.Factory
}