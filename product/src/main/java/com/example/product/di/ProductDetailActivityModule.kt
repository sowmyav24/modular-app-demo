package com.example.product.di

import com.example.product.ui.ProductDetailActivity
import com.example.util.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ProductDetailActivityModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeProductDetailActivity(): ProductDetailActivity
}