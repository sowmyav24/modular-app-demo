package com.example.app.di

import com.example.app.router.CartOutwardRouter
import com.example.cart.di.CartActivityModule
import com.example.cart.navigator.outward.CartOutwardNavigator
import dagger.Binds
import dagger.Module

@Module(includes = [CartActivityModule::class])
interface CartModule {

    @Binds
    fun provideCartOutwardRouter(cartOutwardRouter: CartOutwardRouter): CartOutwardNavigator

}