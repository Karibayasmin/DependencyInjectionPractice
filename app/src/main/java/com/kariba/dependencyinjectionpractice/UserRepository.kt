package com.kariba.dependencyinjectionpractice

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}

class SQLUserRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String){
        Log.e(TAG, "User saved in db")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String){
        Log.e(TAG, "User saved in firebase")
    }
}