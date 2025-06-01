package com.paintology.lite.landscape.painting.ads.koin

import com.paintology.lite.landscape.painting.ads.AdmobAppOpen
import com.paintology.lite.landscape.painting.ads.AdmobBannerAds
import com.paintology.lite.landscape.painting.ads.AdmobInterstitialAds
import com.paintology.lite.landscape.painting.ads.AdmobNativeAds
import com.paintology.lite.landscape.painting.ads.AdmobRewardedInterstitialAds
import com.paintology.lite.landscape.painting.ads.config.RemoteConfiguration
import com.paintology.lite.landscape.painting.ads.im.InternetManager
import com.paintology.lite.landscape.painting.ads.pref.SharedPreferenceUtils
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class DIComponent : KoinComponent {

    // Utils
    val sharedPreferenceUtils by inject<SharedPreferenceUtils>()

    // Managers
    val internetManager by inject<InternetManager>()

    // Remote Configuration
    val remoteConfiguration by inject<RemoteConfiguration>()

    // Ads
    val admobRewardedAds by inject<AdmobRewardedInterstitialAds>()
    val admobInterstitialAds by inject<AdmobInterstitialAds>()
    val admobNativeAds by inject<AdmobNativeAds>()

    //    val admobPreLoadNativeAds by inject<AdmobPreLoadNativeAds>()
    val admobBannerAds by inject<AdmobBannerAds>()
    val admobOpenApp by inject<AdmobAppOpen>()

}