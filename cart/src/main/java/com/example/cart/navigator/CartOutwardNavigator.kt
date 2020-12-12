package com.example.cart.navigator

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.cart.domain.CartItem

interface CartOutwardNavigator {
    fun startPurchase(
        context: Context,
        cartItems: List<CartItem>
    )
}