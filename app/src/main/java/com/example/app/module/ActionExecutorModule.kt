package com.example.app.module

import com.example.app.executor.CartActionExecutor
import com.example.app.executor.ProductActionExecutor
import com.example.app.router.CartOutwardRouter
import com.example.app.router.ProductOutwardRouter
import com.example.cart.navigator.CartOutwardNavigator
import com.example.product.action.ProductAction
import com.example.product.navigator.ProductOutwardNavigator
import com.example.purchase.action.CartAction
import com.example.purchase.inwardNavigator.PurchaseInwardNavigator
import dagger.Module
import dagger.Provides

@Module
class ActionExecutorModule {

    @Provides
    fun provideProductAction(productActionExecutor: ProductActionExecutor) : ProductAction {
        return productActionExecutor
    }

    @Provides
    fun provideCartAction(cartActionExecutor: CartActionExecutor) : CartAction {
        return cartActionExecutor
    }
}