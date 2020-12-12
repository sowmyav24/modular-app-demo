package com.example.product

import com.example.product.ui.ProductActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ProductActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [])
    abstract fun contributeProductActivity(): ProductActivity
}