package com.kariba.dependencyinjectionpractice

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import com.kariba.dependencyinjectionpractice.di.annotation.ActivityScope
import com.kariba.dependencyinjectionpractice.di.annotation.ApplicationScope
import com.kariba.dependencyinjectionpractice.di.service.AnalyticsService
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository{
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLUserRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email: String, password: String){
        Log.e(TAG, "User saved in db")
        analyticsService.trackEvent("Save User", "CREATE")
    }
}

class FirebaseRepository() : UserRepository{
    override fun saveUser(email: String, password: String){
        Log.e(TAG, "User saved in firebase")
        //analyticsService.trackEvent("Save User", "CREATE")
    }
}