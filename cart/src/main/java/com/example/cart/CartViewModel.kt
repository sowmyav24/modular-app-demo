package com.example.cart

import androidx.lifecycle.ViewModel

class CartViewModel : ViewModel() {

    fun getAllCartItems(): List<CartItem> {
        return getAllItems()
    }
    fun getTotalCost(): Int {
        return getAllItems().sumBy { it.price * it.quantity }
    }
}