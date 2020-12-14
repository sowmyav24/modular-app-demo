package com.example.app.di

import com.example.app.router.CartOutwardRouter
import com.example.cart.navigator.outward.CartOutwardNavigator
import dagger.Module
import dagger.Provides

@Module
class CartModule {

    @Provides
    fun provideCartOutwardRouter(cartOutwardRouter: CartOutwardRouter): CartOutwardNavigator {
        return cartOutwardRouter
    }

}