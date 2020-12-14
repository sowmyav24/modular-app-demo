package com.example.purchase.di

import com.example.purchase.ui.PurchaseActivity
import com.example.util.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface PurchaseActivityModule {
    @ActivityScope
    @ContributesAndroidInjector
    fun contributePurchaseActivity(): PurchaseActivity
}