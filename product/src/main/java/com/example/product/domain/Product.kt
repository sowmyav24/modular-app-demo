package com.example.product.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

@Parcelize
data class Product(
    val name: String,
    val description: String,
    val category: String,
    val price: BigDecimal
) : Parcelable

fun getAllProducts(): List<Product> {
    val description =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    return listOf(
        Product(
            name = "Potato - Large 2Kg",
            description = description,
            category = "Grocery",
            price = BigDecimal(50.00)
        ),
        Product(
            name = "Grapes - Green without seeds - 2Kg",
            description = description,
            category = "Grocery",
            price = BigDecimal(100.00)
        ),
        Product(
            name = "Android programming for beginners",
            description = description,
            category = "Books",
            price = BigDecimal(500.00)
        ),
        Product(
            name = "Kotlin Programming for beginners",
            description = description,
            category = "Books",
            price = BigDecimal(800.00)
        ),
        Product(
            name = "Bluetooth earphones with Mic",
            description = description,
            category = "Electronics",
            price = BigDecimal(1000.00)
        ),
        Product(
            name = "Wired earphones with Mic",
            description = description,
            category = "Electronics",
            price = BigDecimal(700.00)
        ),
        Product(
            name = "Dining table for four",
            description = description,
            category = "Furniture",
            price = BigDecimal(100000.00)
        ),
        Product(
            name = "Dining table for eight",
            description = description,
            category = "Furniture",
            price = BigDecimal(20000.00)
        )
    )
}