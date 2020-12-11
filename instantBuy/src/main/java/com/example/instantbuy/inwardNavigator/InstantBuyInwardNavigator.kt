package com.example.instantbuy.inwardNavigator

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import com.example.instantbuy.InstantBuyActivity
import javax.inject.Inject

class InstantBuyInwardNavigator  @Inject constructor() {

    fun startInstantBuy(context: Context) {
       startActivity(context, Intent(context, InstantBuyActivity::class.java), null)
    }
}
