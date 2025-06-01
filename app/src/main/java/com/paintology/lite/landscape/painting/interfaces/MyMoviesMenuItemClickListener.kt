package com.paintology.lite.landscape.painting.interfaces

import com.paintology.lite.landscape.painting.gallery.model_DownloadedTutorial

interface MyMoviesMenuItemClickListener {
    fun onEditClick(item: model_DownloadedTutorial?, position: Int)
    fun onDeleteClick(item: model_DownloadedTutorial?, position: Int)
    fun onShareClick(item: model_DownloadedTutorial?, position: Int)
    fun onPostClick(item: model_DownloadedTutorial?, position: Int)
}