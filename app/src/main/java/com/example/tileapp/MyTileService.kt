package com.example.tileapp

import android.content.Intent
import android.provider.Settings
import android.service.quicksettings.TileService

class MyTileService : TileService() {

    override fun onClick() {
        super.onClick()

        val intent = Intent(Settings.ACTION_DATE_SETTINGS).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }
        startActivityAndCollapse(intent)
    }
}