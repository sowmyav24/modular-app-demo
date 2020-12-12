package com.example.purchase

import com.example.purchase.ui.PurchaseActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class PurchaseActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [])
    abstract fun contributePurchaseActivity(): PurchaseActivity
}