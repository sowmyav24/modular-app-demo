package com.example.cart.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cart.R
import com.example.cart.navigator.CartOutwardNavigator
import com.example.cart.viewmodel.CartViewModel
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_cart.*
import javax.inject.Inject

class CartActivity : AppCompatActivity() {
    private lateinit var viewModel: CartViewModel

    @Inject
    lateinit var cartOutwardNavigator: CartOutwardNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        viewModel = ViewModelProvider(this).get(CartViewModel::class.java)
        val products = findViewById<View>(R.id.cart_products) as RecyclerView
        val adapter = CartAdapter(
            viewModel.getAllCartItems()
        )
        products.adapter = adapter
        products.layoutManager = LinearLayoutManager(this)
        cost.text = "${getString(R.string.total_cost)}${viewModel.getTotalCost()}"
        buy_now.setOnClickListener {
            cartOutwardNavigator.startPurchase(this)
        }
    }
}