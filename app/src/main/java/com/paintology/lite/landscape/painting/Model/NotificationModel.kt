package com.paintology.lite.landscape.painting.Model

import com.paintology.lite.landscape.painting.util.NotificationType

data class NotificationModel(
    val title: String?,
    val text: String?,
    val type: NotificationType,
    val postId: String?,
    val userId: String?
)
