package com.example.cart.service

import com.example.cart.domain.CartProduct
import com.example.cart.domain.addItem
import com.example.cart.domain.removeItems
import javax.inject.Inject

class CartService @Inject constructor() {

    fun add(cartProduct: CartProduct) {
        addItem(cartProduct)
    }

    fun clear() {
        removeItems()
    }
}