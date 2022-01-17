package com.teachmint.testapplication.EventManager

import com.teachmint.tmvaas.iUtils.implementable.SDKEventManager

class EventManager : SDKEventManager {
    private val TAG = "EventManager"
    override fun trackEvent(eventName: String, eventData: Map<String, String>) {
        when (eventName) {
            "LIVE_CLASS_ONGOING" -> {
            }

            "LIVE_CLASS_AGGREGATED_DATA_CLICKS" -> {
            }

            "LIVE_CLASS_AGGREGATED_DATA_DURATION" -> {
            }
        }
    }
}