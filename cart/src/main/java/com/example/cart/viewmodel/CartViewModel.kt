package com.example.cart.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cart.domain.*

class CartViewModel : ViewModel() {

    fun getAllCartItems(): List<CartProduct> {
        return getAllItems()
    }

    fun getTotalCost(): Int {
        return getAllItems().sumBy { it.price * it.quantity }
    }

    fun addItemToCart(cartItem: CartProduct) {
        addItem(cartItem)
    }

    fun clearCart() {
        removeItems()
    }
}