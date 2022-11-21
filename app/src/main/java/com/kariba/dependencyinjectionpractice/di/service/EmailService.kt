package com.kariba.dependencyinjectionpractice

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to: String, body: String)
}

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