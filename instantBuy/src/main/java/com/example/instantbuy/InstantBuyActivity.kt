package com.example.instantbuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instantbuy.ui.main.InstantBuyFragment

class InstantBuyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.instant_buy_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, InstantBuyFragment.newInstance())
                .commitNow()
        }
    }
}