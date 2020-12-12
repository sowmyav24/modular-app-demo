package com.example.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.product.ui.ProductActivity
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

    private fun startProductActivity(category: String) {
        val intent = Intent(this, ProductActivity::class.java)
        intent.putExtra("category", category)
        startActivity(intent)
    }
}