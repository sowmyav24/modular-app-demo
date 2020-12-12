package com.example.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.component.DaggerAppComponent
import com.example.product.ProductActivity
import com.example.product.navigator.ProductOutwardNavigator
import kotlinx.android.synthetic.main.main_activity.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var instantBuyRouter: ProductOutwardNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val create = DaggerAppComponent.create()
        create.inject(this)
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