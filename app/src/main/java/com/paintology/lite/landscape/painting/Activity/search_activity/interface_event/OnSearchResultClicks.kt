package com.paintology.lite.landscape.painting.Activity.search_activity.interface_event

import com.paintology.lite.landscape.painting.Activity.search_activity.model.SearchResultModel

interface OnSearchResultClicks {

    fun onMenuClick(model: SearchResultModel, position: Int)
}