package com.example.cart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CartFragment.newInstance())
                .commitNow()
        }
    }
}