package com.kariba.dependencyinjectionpractice.di.service

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Singleton

interface AnalyticsService {
    fun trackEvent(eventName: String, eventType: String)
}

@Singleton
class Mixpanel : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.e(TAG, "Mixpanel - $eventName - $eventType")
    }

}

class FirebaseAnalytics : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.e(TAG, "FirebaseAnalytics - $eventName - $eventType")
    }

}