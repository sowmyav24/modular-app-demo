package com.example.purchase.ui

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.purchase.navigator.outward.PurchaseOutwardNavigator
import com.example.purchase.domain.PurchaseProduct
import com.example.purchase.R
import com.example.purchase.action.CartAction
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_purchase.*
import javax.inject.Inject

class PurchaseActivity : AppCompatActivity() {

    @Inject
    lateinit var cartAction: CartAction

    @Inject
    lateinit var purchaseOutwardNavigator: PurchaseOutwardNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchase)

        val purchaseProducts = intent.getParcelableArrayListExtra<PurchaseProduct>("PURCHASE_PRODUCT_EXTRA") as? ArrayList<PurchaseProduct>

        var productNames = ""
        purchaseProducts?.forEach { productNames = productNames + " " + it.name + '\n' }
        name.text = productNames
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