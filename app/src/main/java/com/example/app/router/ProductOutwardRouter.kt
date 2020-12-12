package com.example.app.router

import android.content.Context
import com.example.product.navigator.ProductOutwardNavigator
import com.example.purchase.inwardNavigator.PurchaseInwardNavigator

class ProductOutwardRouter(val purchaseInwardNavigator: PurchaseInwardNavigator): ProductOutwardNavigator {

    override fun startPurchase(context: Context) {
        purchaseInwardNavigator.startPurchase(context)
    }
}