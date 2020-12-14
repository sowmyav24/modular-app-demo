package com.example.product.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.example.product.R
import com.example.product.action.CartAction
import com.example.product.domain.Product
import com.example.product.navigator.ProductOutwardNavigator
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.product_detail.*
import javax.inject.Inject

class ProductDetailActivity : AppCompatActivity() {

    @Inject
    lateinit var cartAction: CartAction
    @Inject
    lateinit var productOutwardNavigator: ProductOutwardNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_detail)
        val product = intent.getSerializableExtra("EXTRA_PRODUCT") as? Product
        product?.let {
            product_name.text = it.name
            product_price.text = getString(R.string.price) + it.price.toString();
        }
        add.setOnClickListener {
            product?.let {
                cartAction.addToCart(it)
                Toast.makeText(this, "Item added to cart", Toast.LENGTH_SHORT).show()
            }
        }
        buy.setOnClickListener {
            product?.let {
                cartAction.addToCart(product)
                productOutwardNavigator.startPurchase(this, product)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.product_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.nav_cart -> {
                productOutwardNavigator.startCart(this)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}