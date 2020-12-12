package com.example.product

import com.example.product.ui.ProductDetailActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ProductDetailActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [])
    abstract fun contributeProductDetailActivity(): ProductDetailActivity
}