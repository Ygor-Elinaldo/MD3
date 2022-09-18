package com.eyo.application

import android.app.Application
import com.google.android.material.color.DynamicColors

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        // Apply dynamic color
        if (resources.getBoolean(R.bool.isOnApi31)) {
            DynamicColors.applyToActivitiesIfAvailable(this, R.style.DynamicColorsTheme)
        }
    }
}