package com.paintology.lite.landscape.painting.Activity.gallery_activity.views.fragment

import android.app.Activity
import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.claptofindphone.data.local.data_store.TopLevel
import com.paintology.lite.landscape.painting.Activity.gallery_activity.view_model.DrawingViewModel
import com.paintology.lite.landscape.painting.Activity.notifications.NotificationsViewModel
import com.paintology.lite.landscape.painting.Activity.shared_pref.SharedPref
import com.paintology.lite.landscape.painting.Activity.your_ranking.RankingViewModel
import com.paintology.lite.landscape.painting.room.AppDatabase
import com.paintology.lite.landscape.painting.util.MyApplication
import com.paintology.lite.landscape.painting.util.StringConstants

open class BaseFragment : Fragment() {

    val viewModel: DrawingViewModel by viewModels()
    val notificationsViewModel: NotificationsViewModel by viewModels()
    val rankingViewModel: RankingViewModel by viewModels()


    lateinit var appDatabase: AppDatabase

    var constants = StringConstants()
    lateinit var sharedPref: SharedPref


    val topLevel by lazy {
        TopLevel(context as Activity)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        appDatabase = MyApplication.getDb()
        sharedPref = SharedPref(context)

        constants = StringConstants()

    }
}