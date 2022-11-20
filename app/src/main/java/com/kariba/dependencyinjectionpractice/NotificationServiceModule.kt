package com.kariba.dependencyinjectionpractice

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getMessageService(): NotificationService{
        return MessageService()
    }
}