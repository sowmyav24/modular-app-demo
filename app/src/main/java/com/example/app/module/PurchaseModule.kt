package com.example.app.module

import com.example.app.executor.CartActionExecutor
import com.example.app.router.PurchaseOutwardRouter
import com.example.purchase.PurchaseOutwardNavigator
import dagger.Module
import dagger.Provides

@Module
class PurchaseModule {
    @Provides
    fun providePurchaseOutwardRouter(purchaseOutwardRouter: PurchaseOutwardRouter) : PurchaseOutwardNavigator {
        return purchaseOutwardRouter
    }

    @Provides
    fun provideCartAction(cartActionExecutor: CartActionExecutor): com.example.purchase.action.CartAction {
        return cartActionExecutor
    }
}