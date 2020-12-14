package com.example.app.router

import android.content.Context
import android.content.Intent
import com.example.cart.domain.CartProduct
import com.example.cart.navigator.CartOutwardNavigator
import com.example.purchase.PurchaseProduct
import com.example.purchase.inwardNavigator.PurchaseInwardNavigator
import com.example.purchase.ui.PurchaseActivity
import javax.inject.Inject

class CartOutwardRouter @Inject constructor(var purchaseInwardNavigator: PurchaseInwardNavigator): CartOutwardNavigator {

    override fun startPurchase(
        context: Context,
        cartItems: List<CartProduct>
    ) {
        val intent = Intent(context, PurchaseActivity::class.java)
        val purchaseProducts = cartItems.map {
            it.toPurchaseProduct()
        } as ArrayList<PurchaseProduct>
        intent.putParcelableArrayListExtra("PURCHASE_PRODUCT_EXTRA", purchaseProducts)
        purchaseInwardNavigator.startPurchase(context, intent)
    }

    private fun CartProduct.toPurchaseProduct(): PurchaseProduct {
        return PurchaseProduct(name, price)
    }
}