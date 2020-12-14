package com.example.product.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.product.R
import com.example.product.action.CartAction
import com.example.product.domain.Product
import com.example.product.navigator.outward.ProductOutwardNavigator
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.product_detail.*
import javax.inject.Inject


class ProductDetailActivity : AppCompatActivity() {
    var textCartItemCount: TextView? = null

    @Inject
    lateinit var cartAction: CartAction

    @Inject
    lateinit var productOutwardNavigator: ProductOutwardNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_detail)

        val product: Product? = intent.getParcelableExtra("EXTRA_PRODUCT")
        product?.let { p ->
            product_name.text = p.name
            product_price.text = getString(R.string.price) + p.price.toString()

            add.setOnClickListener {
                cartAction.addToCart(p)
                cartCount()
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
        val menuItem = menu.findItem(R.id.action_cart)
        val actionView: View = menuItem.actionView
        textCartItemCount = actionView.findViewById<View>(R.id.cart_badge) as TextView
        cartCount()
        actionView.setOnClickListener { onOptionsItemSelected(menuItem) }
        return true

    }

    private fun cartCount() {
        textCartItemCount?.text = cartAction.getCartCount().toString()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_cart -> {
                productOutwardNavigator.startCart(this)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}