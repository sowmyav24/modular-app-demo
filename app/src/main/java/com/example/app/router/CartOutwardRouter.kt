package com.example.app.router

import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import com.example.cart.domain.CartItem
import com.example.cart.navigator.CartOutwardNavigator
import com.example.purchase.PurchaseProduct
import com.example.purchase.inwardNavigator.PurchaseInwardNavigator
import com.example.purchase.ui.PurchaseActivity
import javax.inject.Inject

class CartOutwardRouter @Inject constructor(var purchaseInwardNavigator: PurchaseInwardNavigator): CartOutwardNavigator {

    override fun startPurchase(
        context: Context,
        cartItems: List<CartItem>
    ) {
        val intent = Intent(context, PurchaseActivity::class.java)
        //TODO: Fixme
        val purchaseProduct = PurchaseProduct(cartItems[0].name)
        intent.putExtra("PURCHASE_PRODUCT_EXTRA", purchaseProduct)
        purchaseInwardNavigator.startPurchase(context, intent)
    }
}