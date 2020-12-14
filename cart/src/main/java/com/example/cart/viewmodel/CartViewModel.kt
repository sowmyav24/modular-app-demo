package com.example.cart.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cart.domain.CartProduct
import com.example.cart.domain.getAllItems
import java.math.BigDecimal

class CartViewModel : ViewModel() {

    fun getAllCartItems(): List<CartProduct> {
        return getAllItems()
    }

    fun getTotalCost(): BigDecimal {
        return getAllItems()
            .map { it.price.multiply(BigDecimal(it.quantity)) }
            .fold(BigDecimal.ZERO, BigDecimal::add)
    }
}