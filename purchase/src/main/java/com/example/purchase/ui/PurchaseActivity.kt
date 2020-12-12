package com.example.purchase.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.purchase.PurchaseProduct
import com.example.purchase.R
import com.example.purchase.action.CartAction
import com.example.purchase.viewmodel.PurchaseViewModel
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_purchase.*
import javax.inject.Inject

class PurchaseActivity : AppCompatActivity() {
    private lateinit var viewModel: PurchaseViewModel

    @Inject
    lateinit var cartAction: CartAction

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        viewModel = ViewModelProvider(this).get(PurchaseViewModel::class.java)
        super.onCreate(savedInstanceState)
        val purchaseProduct = intent.getSerializableExtra("PURCHASE_PRODUCT_EXTRA") as? PurchaseProduct
        setContentView(R.layout.activity_purchase)
        name.text = purchaseProduct?.name ?: ""
        complete_purchase.setOnClickListener {
            cartAction.clearCart()
        }
    }
}