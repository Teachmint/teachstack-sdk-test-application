package com.teachmint.testapplication

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.teachmint.testapplication.EventManager.EventManager
import com.teachmint.tmvaas.builder.TMVaaSBuilder
import java.util.*


class TestActivity : AppCompatActivity() {

    private val TAG = "TestApplication"

    companion object {
        var activity: Activity? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_activity)

        activity = this

        TMVaaSBuilder()
            .initializeVaas(
                activity = this@TestActivity,
                clientUrl = "{host}/videoroom/{roomId}/{userId}/{authKey}"
            ).addEventManager(sdkEventManager = EventManager())
            .addForegroundServiceNotification(foregroundServiceNotificationBuilder = NotificationBuilder())
            .addScreenShareServiceNotification(screenShareServiceNotificationBuilder = ScreenShareNotification())

    }


}