package com.example.cart.navigator

import android.content.Context
import com.example.cart.domain.CartProduct

interface CartOutwardNavigator {
    fun startPurchase(
        context: Context,
        cartItems: List<CartProduct>
    )
}