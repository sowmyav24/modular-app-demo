package com.example.app.di

import com.example.app.executor.CartActionExecutor
import com.example.app.router.ProductOutwardRouter
import com.example.product.di.ProductDetailActivityModule
import com.example.product.navigator.outward.ProductOutwardNavigator
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module(includes = [ProductDetailActivityModule::class])
interface ProductModule {

    @Binds
    fun provideProductOutwardNavigator(productOutwardRouter: ProductOutwardRouter): ProductOutwardNavigator

    @Binds
    fun provideProductAction(productActionExecutor: CartActionExecutor): com.example.product.action.CartAction

}