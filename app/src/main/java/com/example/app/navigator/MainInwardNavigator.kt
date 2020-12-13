package com.example.app.navigator

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat
import javax.inject.Inject

class MainInwardNavigator @Inject constructor() {
    fun startMain(context: Context, intent: Intent) {
        ContextCompat.startActivity(context, intent, null)
    }
}