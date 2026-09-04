package com.biswas.germana1

import android.app.Application
import android.util.Log
import com.google.android.gms.ads.MobileAds

class GermanA1Application : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "Initializing MobileAds SDK...")
        MobileAds.initialize(this) { initializationStatus ->
            Log.d(TAG, "MobileAds SDK initialized successfully: status=$initializationStatus")
        }
    }

    companion object {
        private const val TAG = "GermanA1Application"
    }
}
