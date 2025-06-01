package com.paintology.lite.landscape.painting.interfaces

import android.view.View
import com.paintology.lite.landscape.painting.Model.GetCategoryPostModel.postData
import com.paintology.lite.landscape.painting.Model.TutorialModel.Tutorialdatum

interface SubCategoryItemClickListener {
    fun selectItem(pos: Int, isFromRelatedPost: Boolean)
    fun selectChildItem(item: postData?, subCategoryName: String?)
    fun onSubMenuClick(view: View?, item: postData?, position: Int)

    fun onSubMenuClickAll(view: View?, item: Tutorialdatum?, position: Int)

    fun selectChildItemAll(item: Tutorialdatum?, subCategoryName: String?)
}