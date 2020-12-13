package com.example.product

import com.example.product.domain.Product

interface ProductDetailListener {
    fun onProductDetailClick(product: Product)
}