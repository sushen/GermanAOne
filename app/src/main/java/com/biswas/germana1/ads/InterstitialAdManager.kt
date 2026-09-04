package com.biswas.germana1.ads

import android.app.Activity
import android.content.Context
import android.util.Log
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class InterstitialAdManager(
    private val context: Context,
    private val adUnitId: String = TEST_INTERSTITIAL_AD_UNIT_ID
) {

    private var interstitialAd: InterstitialAd? = null
    private var isLoading = false

    val isAdAvailable: Boolean
        get() = interstitialAd != null

    fun loadAd() {
        if (interstitialAd != null) {
            Log.d(TAG, "Ad is already loaded.")
            return
        }
        if (isLoading) {
            Log.d(TAG, "Ad is currently loading...")
            return
        }

        isLoading = true
        Log.d(TAG, "Starting interstitial ad request for unit ID: $adUnitId")

        val adRequest = AdRequest.Builder().build()
        InterstitialAd.load(
            context,
            adUnitId,
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdLoaded(ad: InterstitialAd) {
                    isLoading = false
                    interstitialAd = ad
                    Log.d(TAG, "Interstitial ad successfully loaded.")
                }

                override fun onAdFailedToLoad(loadAdError: LoadAdError) {
                    isLoading = false
                    interstitialAd = null
                    Log.e(TAG, "Failed to load interstitial ad: ${loadAdError.message} (code: ${loadAdError.code})")
                }
            }
        )
    }

    fun showAd(activity: Activity, onAdDismissedOrFailed: () -> Unit) {
        val ad = interstitialAd
        if (ad == null) {
            Log.d(TAG, "No interstitial ad available to show.")
            onAdDismissedOrFailed()
            loadAd()
            return
        }

        ad.fullScreenContentCallback = object : FullScreenContentCallback() {
            override fun onAdDismissedFullScreenContent() {
                Log.d(TAG, "Interstitial ad dismissed by user.")
                interstitialAd = null
                onAdDismissedOrFailed()
                loadAd()
            }

            override fun onAdFailedToShowFullScreenContent(adError: AdError) {
                Log.e(TAG, "Failed to show interstitial ad: ${adError.message} (code: ${adError.code})")
                interstitialAd = null
                onAdDismissedOrFailed()
                loadAd()
            }

            override fun onAdShowedFullScreenContent() {
                Log.d(TAG, "Interstitial ad showed full screen content.")
                interstitialAd = null
            }
        }

        Log.d(TAG, "Showing interstitial ad.")
        ad.show(activity)
    }

    companion object {
        private const val TAG = "InterstitialAdManager"
        const val TEST_INTERSTITIAL_AD_UNIT_ID = "ca-app-pub-3940256099942544/1033173712"
    }
}
