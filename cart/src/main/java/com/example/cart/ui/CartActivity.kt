package com.example.cart.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cart.R
import com.example.cart.domain.CartProduct
import com.example.cart.domain.totalCost
import com.example.cart.navigator.outward.CartOutwardNavigator
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
        val cartItems = viewModel.getAllCartItems()

        setCartProductsView(cartItems)
        cost.text = "${getString(R.string.total_cost)}${viewModel.getTotalCost()}"

        buy_now.setOnClickListener {
            cartOutwardNavigator.startPurchase(this, cartItems, totalCost())
        }
    }

    private fun setCartProductsView(cartItems: List<CartProduct>): List<CartProduct> {
        val products = findViewById<View>(R.id.cart_products) as RecyclerView

        val adapter = CartAdapter(
            cartItems
        )
        products.adapter = adapter
        products.layoutManager = LinearLayoutManager(this)
        return cartItems
    }
}