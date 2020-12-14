package com.example.cart.di

import com.example.cart.ui.CartActivity
import com.example.util.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class CartActivityModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeCartActivity(): CartActivity
}