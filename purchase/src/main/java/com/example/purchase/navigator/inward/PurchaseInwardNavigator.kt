package com.example.purchase.navigator.inward

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import com.example.purchase.domain.PurchaseProduct
import com.example.purchase.ui.PurchaseActivity
import javax.inject.Inject

class PurchaseInwardNavigator @Inject constructor() {

    fun startPurchase(context: Context, product: PurchaseProduct) {
        val intent = Intent(context, PurchaseActivity::class.java)
        intent.putExtra("PURCHASE_PRODUCT_EXTRA", product)

        startActivity(context, intent, null)
    }
}
