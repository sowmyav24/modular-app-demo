package com.example.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.component.DaggerAppComponent
import com.example.product.ProductActivity
import com.example.product.navigator.ProductOutwardNavigator
import javax.inject.Inject
import kotlinx.android.synthetic.main.main_activity.grocery

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var instantBuyRouter: ProductOutwardNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val create = DaggerAppComponent.create()
        create.inject(this)
        grocery.setOnClickListener {
            startActivity(Intent(this, ProductActivity::class.java))
        }
    }
}