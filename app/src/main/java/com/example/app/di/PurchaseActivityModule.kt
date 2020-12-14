package com.example.app.di

import com.example.purchase.ui.PurchaseActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class PurchaseActivityModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributePurchaseActivity(): PurchaseActivity
}