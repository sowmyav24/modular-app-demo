package com.example.app.di

import com.example.product.ui.ProductDetailActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ProductDetailActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [ProductModule::class])
    abstract fun contributeProductDetailActivity(): ProductDetailActivity
}