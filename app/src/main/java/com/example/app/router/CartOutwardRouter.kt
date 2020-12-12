package com.example.app.router

import android.content.Context
import com.example.cart.navigator.CartOutwardNavigator
import com.example.product.domain.Product
import com.example.product.navigator.ProductOutwardNavigator
import com.example.purchase.inwardNavigator.PurchaseInwardNavigator
import javax.inject.Inject

class CartOutwardRouter @Inject constructor(var purchaseInwardNavigator: PurchaseInwardNavigator): CartOutwardNavigator {

    override fun startPurchase(context: Context) {
        purchaseInwardNavigator.startPurchase(context)
    }
}