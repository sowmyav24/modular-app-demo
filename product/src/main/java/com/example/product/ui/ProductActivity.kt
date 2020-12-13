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
import com.example.product.action.CartAction
import com.example.product.domain.Product
import com.example.product.navigator.ProductOutwardNavigator
import com.example.product.viewmodel.ProductViewModel
import dagger.android.AndroidInjection;
import javax.inject.Inject

class ProductActivity : AppCompatActivity(), ProductDetailListener {
    private lateinit var viewModel: ProductViewModel

    @Inject
    lateinit var productOutwardNavigator: ProductOutwardNavigator

    @Inject
    lateinit var cartAction: CartAction

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
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

    override fun onBuyNow(product: Product) {
        cartAction.addToCart(product)
        productOutwardNavigator.startPurchase(this, product)
    }
}
