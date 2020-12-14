package com.example.purchase.di

import com.example.purchase.ui.PurchaseActivity
import com.example.util.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class PurchaseActivityModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributePurchaseActivity(): PurchaseActivity
}