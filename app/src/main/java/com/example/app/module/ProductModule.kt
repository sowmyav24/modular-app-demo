package com.example.app.module

import com.example.app.executor.CartActionExecutor
import com.example.app.router.ProductOutwardRouter
import com.example.product.navigator.ProductOutwardNavigator
import dagger.Module
import dagger.Provides

@Module
class ProductModule {

    @Provides
    fun provideProductOutwardNavigator(productOutwardRouter: ProductOutwardRouter) : ProductOutwardNavigator {
        return productOutwardRouter
    }

    @Provides
    fun provideProductAction(productActionExecutor: CartActionExecutor) : com.example.product.action.CartAction {
        return productActionExecutor
    }

}