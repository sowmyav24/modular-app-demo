package com.example.app.router

import android.content.Context
import android.content.Intent
import com.example.cart.navigator.inward.CartInwardNavigator
import com.example.cart.ui.CartActivity
import com.example.product.domain.Product
import com.example.product.navigator.outward.ProductOutwardNavigator
import com.example.purchase.domain.PurchaseProduct
import com.example.purchase.navigator.inward.PurchaseInwardNavigator
import javax.inject.Inject

class ProductOutwardRouter @Inject constructor(
    var purchaseInwardNavigator: PurchaseInwardNavigator,
    var cartInwardNavigator: CartInwardNavigator
) : ProductOutwardNavigator {

    override fun startPurchase(
        context: Context,
        product: Product
    ) {
        val purchaseProduct = PurchaseProduct(
            listOf(product.name),
            product.price
        )
        purchaseInwardNavigator.startPurchase(context, purchaseProduct)
    }

    override fun startCart(context: Context) {
        val intent = Intent(context, CartActivity::class.java)
        cartInwardNavigator.startCart(context, intent)
    }
}