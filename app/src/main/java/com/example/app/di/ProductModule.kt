package com.example.app.di

import com.example.app.executor.CartActionExecutor
import com.example.app.router.ProductOutwardRouter
import com.example.product.navigator.outward.ProductOutwardNavigator
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