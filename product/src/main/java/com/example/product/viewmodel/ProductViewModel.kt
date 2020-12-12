package com.example.product.viewmodel

import androidx.lifecycle.ViewModel
import com.example.product.domain.Product
import com.example.product.domain.getAllProducts

class ProductViewModel : ViewModel() {

    fun getProducts(category: String): List<Product> {
        return getAllProducts().filter { it.category == category }
    }
}