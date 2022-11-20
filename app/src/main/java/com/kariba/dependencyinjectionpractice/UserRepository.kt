package com.kariba.dependencyinjectionpractice

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email: String, password: String){
        Log.e(TAG, "User saved in db")
    }
}