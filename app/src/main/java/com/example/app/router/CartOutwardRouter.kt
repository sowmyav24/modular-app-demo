package com.example.app.router

import android.content.Context
import com.example.cart.domain.CartProduct
import com.example.cart.domain.totalCost
import com.example.cart.navigator.outward.CartOutwardNavigator
import com.example.purchase.domain.PurchaseProduct
import com.example.purchase.navigator.inward.PurchaseInwardNavigator
import java.math.BigDecimal
import javax.inject.Inject

class CartOutwardRouter @Inject constructor(var purchaseInwardNavigator: PurchaseInwardNavigator) :
    CartOutwardNavigator {

    override fun startPurchase(
        context: Context,
        cartItems: List<CartProduct>,
        total: BigDecimal
    ) {
        val names = cartItems.map { it.name }
        val purchaseProduct = PurchaseProduct(
            names = names,
            total = total
        )
        purchaseInwardNavigator.startPurchase(context, purchaseProduct)
    }
}