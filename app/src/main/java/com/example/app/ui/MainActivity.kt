package com.example.app.ui

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.app.R
import com.example.cart.service.CartService
import com.example.cart.ui.CartActivity
import com.example.product.ui.ProductListActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.main_activity.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    var textCartItemCount: TextView? = null

    @Inject
    lateinit var cartService: CartService

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        grocery.setOnClickListener {
            startProductActivity("Grocery")
        }
        book.setOnClickListener {
            startProductActivity("Books")
        }
        electronics.setOnClickListener {
            startProductActivity("Electronics")

        }
        furniture.setOnClickListener {
            startProductActivity("Furniture")

        }
    }

    override fun onResume() {
        super.onResume()
        cartCount()
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_cart -> {
                startActivity(Intent(this, CartActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun startProductActivity(category: String) {
        val intent = Intent(this, ProductListActivity::class.java)
        intent.putExtra("category", category)
        startActivity(intent)
    }

    private fun cartCount() {
        textCartItemCount?.text = cartService.getCartCount().toString()
    }

}