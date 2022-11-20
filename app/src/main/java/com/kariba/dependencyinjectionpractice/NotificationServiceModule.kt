package com.kariba.dependencyinjectionpractice

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NotificationServiceModule {

    /*@Provides
    fun getMessageService(): NotificationService{
        return MessageService()
    }*/

    /*@Provides
    fun getEmailService(emailService: EmailService): NotificationService{
        return emailService
    }*/

    @Binds
    abstract fun getEmailService(emailService: EmailService) : NotificationService
}