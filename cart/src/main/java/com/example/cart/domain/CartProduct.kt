package com.example.cart.domain

import java.math.BigDecimal

data class CartProduct(val name: String, val price: BigDecimal, var quantity: Int)

var cartItems = mutableListOf<CartProduct>()

fun getAllItems(): List<CartProduct> {
    return cartItems
}

fun addItem(cartItem: CartProduct) {
    val cartItemPresent = cartItems.find { it.name == cartItem.name }
    cartItemPresent?.let {
        it.quantity += 1
    } ?: cartItems.add(cartItem)
}

fun removeItems() {
    cartItems = mutableListOf()
}

fun totalCost(): BigDecimal {
    return getAllItems()
        .map { it.price.multiply(BigDecimal(it.quantity)) }
        .fold(BigDecimal.ZERO, BigDecimal::add)
}