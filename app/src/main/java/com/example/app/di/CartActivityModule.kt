package com.example.app.di

import com.example.cart.ui.CartActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class CartActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [CartModule::class])
    abstract fun contributeCartActivity(): CartActivity
}