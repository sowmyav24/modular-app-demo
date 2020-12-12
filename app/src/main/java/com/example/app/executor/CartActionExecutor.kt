package com.example.app.executor

import com.example.cart.CartService
import com.example.purchase.action.CartAction
import javax.inject.Inject

class CartActionExecutor @Inject constructor(private val cartService: CartService) :
    CartAction {

    override fun clearCart() {
        cartService.clearCart()
    }
}
