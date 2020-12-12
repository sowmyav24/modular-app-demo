package com.example.cart.domain

data class CartItem(val name: String, val price: Int, val quantity: Int)

fun getAllItems(): List<CartItem> {
    return listOf(
        CartItem("Potato - Large 2Kg", 50, 2),
        CartItem(
            "Grapes - Green without seeds - 2Kg",
            100,
            2
        )
    )
}