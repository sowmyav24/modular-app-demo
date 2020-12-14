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

        val product : Product? = intent.getParcelableExtra("EXTRA_PRODUCT")
        product?.let { p ->
            product_name.text = p.name
            product_price.text = getString(R.string.price) + p.price.toString()

            add.setOnClickListener {
                cartAction.addToCart(p)
                Toast.makeText(this, "Item added to cart", Toast.LENGTH_SHORT).show()
            }

            buy.setOnClickListener {
                cartAction.addToCart(p)
                productOutwardNavigator.startPurchase(this, p)
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