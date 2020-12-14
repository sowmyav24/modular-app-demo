package com.example.app.di

import com.example.app.MyApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [AndroidInjectionModule::class,
        MyApplicationModule::class,
        ProductModule::class,
        PurchaseModule::class,
        CartModule::class]
)
interface AppComponent : AndroidInjector<MyApplication>