package com.example.app.module

import com.example.app.InstantBuyRouter
import com.example.instantbuy.inwardNavigator.InstantBuyInwardNavigator
import com.example.product.navigator.ProductOutwardNavigator
import dagger.Module
import dagger.Provides

@Module
class InstantBuyModule {

    @Provides
    fun provideProductOutwardNavigator(instantBuyInwardNavigator: InstantBuyInwardNavigator): ProductOutwardNavigator {
        return InstantBuyRouter(instantBuyInwardNavigator)
    }

}
