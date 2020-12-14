package com.example.product.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.product.ProductDetailListener
import com.example.product.R
import com.example.product.domain.Product
import com.example.product.viewmodel.ProductViewModel

class ProductActivity : AppCompatActivity(), ProductDetailListener {
    private lateinit var viewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val category = intent.getStringExtra("category") ?: ""
        val bundle = Bundle()
        bundle.putString("category", category)
        viewModel = ViewModelProvider(this).get(ProductViewModel::class.java)
        val products = findViewById<View>(R.id.products) as RecyclerView
        val productList = viewModel.getProducts(category)
        val adapter = ProductAdapter(productList, this)
        products.adapter = adapter
        products.layoutManager = LinearLayoutManager(applicationContext)
    }

    override fun onProductDetailClick(product: Product) {
        val intent = Intent(applicationContext, ProductDetailActivity::class.java)
        intent.putExtra("EXTRA_PRODUCT", product)
        startActivity(intent)
    }
}
