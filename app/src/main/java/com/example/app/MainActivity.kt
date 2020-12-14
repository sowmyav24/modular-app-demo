package com.example.app

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.cart.ui.CartActivity
import com.example.product.ui.ProductListActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    private fun startProductActivity(category: String) {
        val intent = Intent(this, ProductListActivity::class.java)
        intent.putExtra("category", category)
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.nav_cart -> {
                startActivity(Intent(this, CartActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}