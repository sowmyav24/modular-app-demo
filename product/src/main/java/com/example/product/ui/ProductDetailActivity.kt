package com.example.product.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.product.R
import kotlinx.android.synthetic.main.product_detail.product_name
import kotlinx.android.synthetic.main.product_detail.product_price

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_detail)
        product_name.text = intent.getStringExtra("name").toString();
        product_price.text = getString(R.string.price) + intent.getIntExtra("price", 0).toString();

    }
}