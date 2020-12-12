package com.example.purchase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.purchase.ui.main.PurchaseFragment

class PurchaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchase)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PurchaseFragment.newInstance())
                .commitNow()
        }
    }
}