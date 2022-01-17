package com.teachmint.testapplication

import android.content.Context
import android.graphics.Color
import androidx.core.app.NotificationCompat
import com.teachmint.tmvaas.iUtils.implementable.ServiceNotificationBuilder

const val ForegroundServiceNotificationIcon = 4561
const val NotificationChannelId = "TMVAAS_NOTIFICATION_ID"

class NotificationBuilder : ServiceNotificationBuilder {

    override fun getNotification(context: Context): NotificationCompat.Builder {
        return NotificationCompat.Builder(context, NotificationChannelId)
            .setSmallIcon(ForegroundServiceNotificationIcon)
            .setColor(Color.parseColor("#1DA1F2"))
            .setWhen(System.currentTimeMillis())
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setOnlyAlertOnce(true)
            .setContentTitle("Notification Title")
            .setContentText("Notification Text")
    }
}