package com.kariba.dependencyinjectionpractice.di.module

import com.kariba.dependencyinjectionpractice.EmailService
import com.kariba.dependencyinjectionpractice.di.annotation.MessageQualifier
import com.kariba.dependencyinjectionpractice.MessageService
import com.kariba.dependencyinjectionpractice.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() {

    @MessageQualifier
    @Provides
    fun getMessageService(retryCount : Int): NotificationService {
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }

    /*@Binds
    abstract fun getEmailService(emailService: EmailService) : NotificationService*/
}