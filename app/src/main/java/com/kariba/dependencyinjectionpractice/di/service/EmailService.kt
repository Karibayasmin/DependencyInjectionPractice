package com.kariba.dependencyinjectionpractice

import android.content.ContentValues.TAG
import android.util.Log
import com.kariba.dependencyinjectionpractice.di.annotation.ActivityScope
import com.kariba.dependencyinjectionpractice.di.annotation.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun send(to: String, body: String)
}

@ActivityScope
class EmailService @Inject constructor() : NotificationService{
    override fun send(to: String, body: String){
        Log.e(TAG, "Email sent")
    }
}

class MessageService(private val retryCount : Int) : NotificationService{
    override fun send(to: String, body: String) {
        Log.e(TAG, "Message sent - Retry Count $retryCount")
    }

}