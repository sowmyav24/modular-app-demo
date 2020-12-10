package com.example.product

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.product.ui.main.ProductFragment

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ProductFragment.newInstance())
                .commitNow()
        }
    }
}