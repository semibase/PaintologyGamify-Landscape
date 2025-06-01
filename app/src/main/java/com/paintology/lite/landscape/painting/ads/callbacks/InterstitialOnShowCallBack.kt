package com.paintology.lite.landscape.painting.ads.callbacks

interface InterstitialOnShowCallBack {
    fun onAdDismissedFullScreenContent()
    fun onAdFailedToShowFullScreenContent()
    fun onAdShowedFullScreenContent()
    fun onAdImpression()
}