package com.kariba.dependencyinjectionpractice.di.module

import com.kariba.dependencyinjectionpractice.di.service.AnalyticsService
import com.kariba.dependencyinjectionpractice.di.service.Mixpanel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Provides
    @Singleton
    fun getAnalyticsService() : AnalyticsService{
        return Mixpanel()
    }
}