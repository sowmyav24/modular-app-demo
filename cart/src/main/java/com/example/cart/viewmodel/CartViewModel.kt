package com.example.cart.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cart.domain.CartProduct
import com.example.cart.domain.addItem
import com.example.cart.domain.getAllItems
import com.example.cart.domain.removeItems

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