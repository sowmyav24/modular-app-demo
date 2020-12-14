package com.example.cart.navigator.inward

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import javax.inject.Inject

class CartInwardNavigator  @Inject constructor() {

    fun startCart(context: Context, intent: Intent) {
       startActivity(context, intent, null)
    }
}
