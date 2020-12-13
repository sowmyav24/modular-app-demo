package com.example.product.navigator

import android.content.Context
import com.example.product.domain.Product

interface ProductOutwardNavigator {
    fun startPurchase(context: Context, product: Product)
    fun startCart(context: Context)
}