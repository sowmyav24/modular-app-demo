package com.example.product.domain


data class Product(val name: String, val price: Int, val category: String)

fun getAllProducts(): List<Product> {
    return listOf(
        Product("Potato - Large 2Kg", 50, "Grocery"),
        Product("Grapes - Green without seeds - 2Kg", 100, "Grocery"),
        Product("Android programming for beginners", 500, "Books"),
        Product("Kotlin Programming for beginners", 800, "Books"),
        Product("Bluetooth earphones with Mic", 1000, "Electronics"),
        Product("Wired earphones with Mic", 700, "Electronics"),
        Product("Dining table for four", 100000, "Furniture"),
        Product("Dining table for eight", 20000, "Furniture")
    )
}