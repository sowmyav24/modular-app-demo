package com.example.cart.domain

data class CartProduct(val name: String, val price: Int, var quantity: Int)

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