package com.example.app.component

import com.example.app.CartActivityModule
import com.example.app.MainActivity
import com.example.app.MyApplication
import com.example.app.MyApplicationModule
import com.example.app.module.ProductOutwardRouterModule
import com.example.product.ProductActivityModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector


@Component(
    modules = [AndroidInjectionModule::class,
        MyApplicationModule::class,
        ProductActivityModule::class,
        ProductOutwardRouterModule::class,
        CartActivityModule::class]
)
interface AppComponent : AndroidInjector<MyApplication> {
    fun inject(mainActivity: MainActivity)
}
