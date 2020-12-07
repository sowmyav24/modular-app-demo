package com.example.order

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.order.ui.main.PurchaseFragment

class PurchaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.purchase_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PurchaseFragment.newInstance())
                .commitNow()
        }
    }
}