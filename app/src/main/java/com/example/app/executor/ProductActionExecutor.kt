package com.example.app.executor

import com.example.cart.CartService
import com.example.cart.domain.CartProduct
import com.example.product.action.ProductAction
import com.example.product.domain.Product
import javax.inject.Inject

class ProductActionExecutor @Inject constructor(private val cartService: CartService) :
    ProductAction {

    override fun addToCart(product: Product) {
        cartService.add(product.toCartProduct())
    }

    private fun Product.toCartProduct(): CartProduct {
        return CartProduct(name, price, 1)
    }
}
