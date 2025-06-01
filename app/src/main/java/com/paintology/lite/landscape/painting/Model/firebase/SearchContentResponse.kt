package com.paintology.lite.landscape.painting.Model.firebase

import com.paintology.lite.landscape.painting.Model.CommunityPost


class SearchContentResponse (
    var community_posts: List<CommunityPost> = listOf(),
    var tutorials: List<Post> = listOf(),
    var posts: List<Post> = listOf()
)
