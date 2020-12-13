package com.example.app.module

import com.example.purchase.ui.PurchaseActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class PurchaseActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [PurchaseModule::class])
    abstract fun contributePurchaseActivity(): PurchaseActivity
}