package com.example.cart.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cart.domain.CartProduct
import com.example.cart.domain.getAllItems
import com.example.cart.domain.totalCost
import com.example.util.formatPrice

class CartViewModel : ViewModel() {

    fun getAllCartItems(): List<CartProduct> {
        return getAllItems()
    }

    fun getTotalCost(): String {
        return formatPrice(totalCost())
    }
}