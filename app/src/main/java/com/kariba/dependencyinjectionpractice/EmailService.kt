package com.kariba.dependencyinjectionpractice

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun send(to: String, body: String){
        Log.e(TAG, "Email sent")
    }
}