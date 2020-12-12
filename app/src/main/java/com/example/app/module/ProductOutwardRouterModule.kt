package com.example.app.module

import com.example.app.router.ProductOutwardRouter
import com.example.product.navigator.ProductOutwardNavigator
import com.example.purchase.inwardNavigator.PurchaseInwardNavigator
import dagger.Module
import dagger.Provides

@Module
class ProductOutwardRouterModule {

    @Provides
    fun provideProductOutwardNavigator(productOutwardRouter: ProductOutwardRouter) : ProductOutwardNavigator {
        return productOutwardRouter
    }
}