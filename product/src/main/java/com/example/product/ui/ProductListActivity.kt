package com.example.product.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.product.R
import com.example.product.domain.Product
import com.example.product.viewmodel.ProductViewModel
import kotlinx.android.synthetic.main.activity_product.*

class ProductListActivity : AppCompatActivity() {
    private lateinit var viewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val category = intent.getStringExtra("category") ?: ""

        viewModel = ViewModelProvider(this).get(ProductViewModel::class.java)

        val adapter = ProductAdapter(viewModel.getProducts(category), this::onProductClick)
        products.adapter = adapter
        products.layoutManager = LinearLayoutManager(applicationContext)
    }

    private fun onProductClick(product: Product) {
        val intent = Intent(applicationContext, ProductDetailActivity::class.java)
        intent.putExtra("EXTRA_PRODUCT", product)
        startActivity(intent)
    }
}
