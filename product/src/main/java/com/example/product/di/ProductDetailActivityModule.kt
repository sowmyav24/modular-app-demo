package com.example.product.di

import com.example.product.ui.ProductDetailActivity
import com.example.util.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ProductDetailActivityModule {

    @ActivityScope
    @ContributesAndroidInjector
    fun contributeProductDetailActivity(): ProductDetailActivity
}