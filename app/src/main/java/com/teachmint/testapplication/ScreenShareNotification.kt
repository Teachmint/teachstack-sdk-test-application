package com.teachmint.testapplication

import android.content.Context
import android.graphics.Color
import androidx.core.app.NotificationCompat
import com.teachmint.tmvaas.iUtils.implementable.ServiceNotificationBuilder

val ShareScreenNotificationServiceIcon = 4562

class ScreenShareNotification : ServiceNotificationBuilder {

    override fun getNotification(context: Context): NotificationCompat.Builder {
        return NotificationCompat.Builder(context, NotificationChannelId)
            .setSmallIcon(ShareScreenNotificationServiceIcon)
            .setColor(Color.parseColor("#1DA1F2"))
            .setWhen(System.currentTimeMillis())
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setOnlyAlertOnce(true)
            .setContentTitle("Share Screen Title")
            .setContentText("Share Screen Text")
    }
}