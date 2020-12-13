package com.example.purchase.ui

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.purchase.PurchaseOutwardNavigator
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

    @Inject
    lateinit var purchaseOutwardNavigator: PurchaseOutwardNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        viewModel = ViewModelProvider(this).get(PurchaseViewModel::class.java)
        super.onCreate(savedInstanceState)
        val purchaseProduct = intent.getSerializableExtra("PURCHASE_PRODUCT_EXTRA") as? PurchaseProduct
        setContentView(R.layout.activity_purchase)
        name.text = purchaseProduct?.name ?: ""
        complete_purchase.setOnClickListener {
            cartAction.clearCart()
            completeShopping()
        }
    }

    private fun completeShopping() {
        AlertDialog.Builder(this)
            .setTitle("Done")
            .setMessage("Thank you for shopping with us !")
            .setPositiveButton(android.R.string.yes
            ) { _, _ ->
                purchaseOutwardNavigator.startMain(this)
            }
            .show()
    }
}