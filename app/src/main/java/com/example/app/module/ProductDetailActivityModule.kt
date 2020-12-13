package com.example.app.module

import com.example.product.ui.ProductDetailActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ProductDetailActivityModule {

    @com.example.app.module.ActivityScope
    @ContributesAndroidInjector(modules = [ProductModule::class])
    abstract fun contributeProductDetailActivity(): ProductDetailActivity
}