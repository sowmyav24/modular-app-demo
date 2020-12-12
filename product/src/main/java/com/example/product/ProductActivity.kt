package com.example.product

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.product.ui.main.ProductFragment

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val category = intent.getStringExtra("category") ?: ""
        val bundle = Bundle()
        bundle.putString("category", category)
        if (savedInstanceState == null) {
            val fragment = ProductFragment.newInstance()
            fragment.arguments = bundle
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commitNow()
        }
    }
}