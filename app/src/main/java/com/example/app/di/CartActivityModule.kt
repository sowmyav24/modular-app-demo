package com.example.app.di

import com.example.cart.ui.CartActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class CartActivityModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeCartActivity(): CartActivity
}