package com.example.cart.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cart.R

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.container,
                    CartFragment.newInstance()
                )
                .commitNow()
        }
    }
}