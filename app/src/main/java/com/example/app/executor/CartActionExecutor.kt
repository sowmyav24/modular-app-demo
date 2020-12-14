package com.example.app.executor

import com.example.cart.service.CartService
import com.example.cart.domain.CartProduct
import com.example.product.domain.Product
import com.example.purchase.action.CartAction
import javax.inject.Inject

class CartActionExecutor @Inject constructor(private val cartService: CartService) :
    CartAction, com.example.product.action.CartAction {

    override fun clearCart() {
        cartService.clear()
    }

    override fun addToCart(product: Product) {
        cartService.add(product.toCartProduct())
    }

    private fun Product.toCartProduct(): CartProduct {
        return CartProduct(name, price, 1)
    }
}
