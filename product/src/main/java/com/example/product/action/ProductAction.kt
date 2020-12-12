package com.example.product.action

import com.example.product.domain.Product

interface ProductAction {
    fun addToCart(name: Product)
}