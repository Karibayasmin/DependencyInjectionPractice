package com.kariba.dependencyinjectionpractice

import android.content.ContentValues.TAG
import android.util.Log

class EmailService {
    fun send(to: String, body: String){
        Log.e(TAG, "Email sent")
    }
}