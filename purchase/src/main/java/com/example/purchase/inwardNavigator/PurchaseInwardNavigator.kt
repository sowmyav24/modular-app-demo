package com.example.purchase.inwardNavigator

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import com.example.purchase.ui.PurchaseActivity
import javax.inject.Inject

class PurchaseInwardNavigator  @Inject constructor() {

    fun startPurchase(context: Context) {
       startActivity(context, Intent(context, PurchaseActivity::class.java), null)
    }
}
