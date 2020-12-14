package com.example.purchase.inwardNavigator

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import javax.inject.Inject

class PurchaseInwardNavigator  @Inject constructor() {

    fun startPurchase(context: Context, intent: Intent) {
       startActivity(context, intent, null)
    }
}
