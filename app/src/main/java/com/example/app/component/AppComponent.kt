package com.example.app.component

import com.example.app.MainActivity
import com.example.app.MyApplication
import com.example.app.MyApplicationModule
import com.example.app.module.*
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [AndroidInjectionModule::class,
        MyApplicationModule::class,
        ProductDetailActivityModule::class,
        PurchaseActivityModule::class,
        ProductModule::class,
        CartModule::class,
        PurchaseModule::class,
        CartActivityModule::class]
)
interface AppComponent : AndroidInjector<MyApplication> {
    fun inject(mainActivity: MainActivity)
}
