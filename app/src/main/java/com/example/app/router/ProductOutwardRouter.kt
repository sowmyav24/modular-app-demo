package com.example.app.router

import android.content.Context
import com.example.product.domain.Product
import com.example.product.navigator.ProductOutwardNavigator
import com.example.purchase.inwardNavigator.PurchaseInwardNavigator
import javax.inject.Inject

class ProductOutwardRouter @Inject constructor(var purchaseInwardNavigator: PurchaseInwardNavigator): ProductOutwardNavigator {

    override fun startPurchase(
        context: Context,
        product: Product
    ) {
        purchaseInwardNavigator.startPurchase(context)
    }
}