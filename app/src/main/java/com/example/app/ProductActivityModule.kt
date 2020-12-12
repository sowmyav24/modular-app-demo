package com.example.app

import com.example.cart.ui.CartActivity
import com.example.product.ui.ProductActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class CartActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [])
    abstract fun contributeCartActivity(): CartActivity
}