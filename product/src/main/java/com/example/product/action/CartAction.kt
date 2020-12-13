package com.example.product.action

import com.example.product.domain.Product

interface CartAction {
    fun addToCart(product: Product)
}