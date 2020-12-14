package com.example.app.di

import com.example.product.ui.ProductDetailActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ProductDetailActivityModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeProductDetailActivity(): ProductDetailActivity
}