package com.example.app.di

import com.example.app.MyApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [AndroidInjectionModule::class,
        MyApplicationModule::class,
        ProductDetailActivityModule::class,
        PurchaseActivityModule::class,
        CartActivityModule::class]
)
interface AppComponent : AndroidInjector<MyApplication>