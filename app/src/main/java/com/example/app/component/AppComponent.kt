package com.example.app.component

import com.example.app.CartActivityModule
import com.example.app.MainActivity
import com.example.app.MyApplication
import com.example.app.MyApplicationModule
import com.example.app.module.ActionExecutorModule
import com.example.app.module.OutwardRouterModule
import com.example.product.ProductDetailActivityModule
import com.example.purchase.PurchaseActivityModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [AndroidInjectionModule::class,
        MyApplicationModule::class,
        ProductDetailActivityModule::class,
        PurchaseActivityModule::class,
        OutwardRouterModule::class,
        ActionExecutorModule::class,
        CartActivityModule::class]
)
interface AppComponent : AndroidInjector<MyApplication> {
    fun inject(mainActivity: MainActivity)
}
