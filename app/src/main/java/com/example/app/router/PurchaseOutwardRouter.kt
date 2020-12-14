package com.example.app.router

import android.content.Context
import android.content.Intent
import com.example.app.MainActivity
import com.example.app.navigator.MainInwardNavigator
import com.example.purchase.navigator.outward.PurchaseOutwardNavigator
import javax.inject.Inject

class PurchaseOutwardRouter @Inject constructor(var mainInwardNavigator: MainInwardNavigator) :
    PurchaseOutwardNavigator {

    override fun startMain(context: Context) {
        val intent = Intent(context, MainActivity::class.java)
        mainInwardNavigator.startMain(context, intent)
    }
}