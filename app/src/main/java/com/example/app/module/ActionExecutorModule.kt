package com.example.app.module

import com.example.app.executor.CartActionExecutor
import dagger.Module
import dagger.Provides

@Module
class ActionExecutorModule {

    @Provides
    fun provideProductAction(productActionExecutor: CartActionExecutor) : com.example.product.action.CartAction {
        return productActionExecutor
    }

    @Provides
    fun provideCartAction(cartActionExecutor: CartActionExecutor) : com.example.purchase.action.CartAction {
        return cartActionExecutor
    }
}