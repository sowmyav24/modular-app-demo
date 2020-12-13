package com.example.app.module

import com.example.app.router.CartOutwardRouter
import com.example.app.router.ProductOutwardRouter
import com.example.app.router.PurchaseOutwardRouter
import com.example.cart.navigator.CartOutwardNavigator
import com.example.product.navigator.ProductOutwardNavigator
import com.example.purchase.PurchaseOutwardNavigator
import dagger.Module
import dagger.Provides

@Module
class OutwardRouterModule {

    @Provides
    fun provideProductOutwardNavigator(productOutwardRouter: ProductOutwardRouter) : ProductOutwardNavigator {
        return productOutwardRouter
    }

    @Provides
    fun provideCartOutwardRouter(cartOutwardRouter: CartOutwardRouter) : CartOutwardNavigator {
        return cartOutwardRouter
    }

    @Provides
    fun providePurchaseOutwardRouter(purchaseOutwardRouter: PurchaseOutwardRouter) : PurchaseOutwardNavigator {
        return purchaseOutwardRouter
    }
}