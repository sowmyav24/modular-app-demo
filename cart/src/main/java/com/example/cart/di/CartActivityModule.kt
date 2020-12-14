package com.example.cart.di

import com.example.cart.ui.CartActivity
import com.example.util.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface CartActivityModule {
    @ActivityScope
    @ContributesAndroidInjector
    fun contributeCartActivity(): CartActivity
}