package com.paintology.lite.landscape.painting.ads.consent

interface ConsentCallback {
    fun onAdsLoad(canRequestAd: Boolean) {}
    fun onConsentFormShow() {}
    fun onConsentFormDismissed() {}
    fun onPolicyStatus(required: Boolean) {}
}