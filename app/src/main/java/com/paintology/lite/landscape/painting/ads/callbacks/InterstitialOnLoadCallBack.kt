package com.paintology.lite.landscape.painting.ads.callbacks

interface InterstitialOnLoadCallBack {
    fun onAdFailedToLoad(adError: String)
    fun onAdLoaded()
    fun onPreloaded()
}