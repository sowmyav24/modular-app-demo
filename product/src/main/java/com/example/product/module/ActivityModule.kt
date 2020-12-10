package com.example.product.module

import com.example.product.ProductActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector()
    abstract fun contributeProductActivity(): ProductActivity
}