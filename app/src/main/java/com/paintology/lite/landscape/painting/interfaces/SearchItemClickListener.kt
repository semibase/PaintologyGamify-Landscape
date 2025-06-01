package com.paintology.lite.landscape.painting.interfaces

import com.paintology.lite.landscape.painting.Enums.SearchResultType

interface SearchItemClickListener {
    fun selectItem(pos: Int, type: SearchResultType)
}