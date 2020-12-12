package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.component.DaggerAppComponent
import com.example.product.navigator.ProductOutwardNavigator
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var instantBuyRouter: ProductOutwardNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val create = DaggerAppComponent.create();
        create.inject(this)

//        instantBuyRouter.startInstantBuy(this)
    }
}