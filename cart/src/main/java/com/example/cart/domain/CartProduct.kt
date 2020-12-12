package com.example.cart.domain

data class CartProduct(val name: String, val price: Int, val quantity: Int)

var cartItems = mutableListOf(
    CartProduct("Potato - Large 2Kg", 50, 2),
    CartProduct(
        "Grapes - Green without seeds - 2Kg",
        100,
        2
    )
)

fun getAllItems(): List<CartProduct> {
    return cartItems
}

fun addItem(cartItem: CartProduct) {
    cartItems.add(cartItem)
}

fun removeItems() {
    cartItems = mutableListOf()
}