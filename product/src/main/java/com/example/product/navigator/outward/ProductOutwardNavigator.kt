package com.example.product.navigator.outward

import android.content.Context
import com.example.product.domain.Product

interface ProductOutwardNavigator {
    fun startPurchase(context: Context, product: Product)
    fun startCart(context: Context)
}