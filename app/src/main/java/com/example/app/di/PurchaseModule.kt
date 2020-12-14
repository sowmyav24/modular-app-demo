package com.example.app.di

import com.example.app.executor.CartActionExecutor
import com.example.app.router.PurchaseOutwardRouter
import com.example.purchase.di.PurchaseActivityModule
import com.example.purchase.navigator.outward.PurchaseOutwardNavigator
import dagger.Binds
import dagger.Module

@Module(includes = [PurchaseActivityModule::class])
interface PurchaseModule {
    @Binds
    fun providePurchaseOutwardRouter(purchaseOutwardRouter: PurchaseOutwardRouter) : PurchaseOutwardNavigator

    @Binds
    fun provideCartAction(cartActionExecutor: CartActionExecutor): com.example.purchase.action.CartAction
}