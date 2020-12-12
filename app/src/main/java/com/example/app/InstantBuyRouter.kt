package com.example.app

import android.content.Context
import com.example.purchase.inwardNavigator.InstantBuyInwardNavigator
import com.example.product.navigator.ProductOutwardNavigator

class InstantBuyRouter(var instantBuyInwardNavigator: InstantBuyInwardNavigator) :
    ProductOutwardNavigator {
    override fun startInstantBuy(context: Context) {
        instantBuyInwardNavigator.startInstantBuy(context)
    }
}
