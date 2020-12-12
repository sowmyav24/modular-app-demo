package com.example.purchase.inwardNavigator

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import com.example.purchase.PurchaseActivity
import javax.inject.Inject

class InstantBuyInwardNavigator  @Inject constructor() {

    fun startInstantBuy(context: Context) {
       startActivity(context, Intent(context, PurchaseActivity::class.java), null)
    }
}
