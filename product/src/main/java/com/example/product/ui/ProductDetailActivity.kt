package com.example.product.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.product.R
import com.example.product.action.ProductAction
import com.example.product.domain.Product
import com.example.product.navigator.ProductOutwardNavigator
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.product_detail.add
import kotlinx.android.synthetic.main.product_detail.buy
import kotlinx.android.synthetic.main.product_detail.product_name
import kotlinx.android.synthetic.main.product_detail.product_price
import javax.inject.Inject

class ProductDetailActivity : AppCompatActivity() {

    @Inject
    lateinit var productAction: ProductAction
    @Inject
    lateinit var productOutwardNavigator: ProductOutwardNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_detail)
        val product = intent.getSerializableExtra("EXTRA_PRODUCT") as? Product
        product?.let {
            product_name.text = it.name
            product_price.text = getString(R.string.price) + it.price.toString();
        }
        add.setOnClickListener {
            product?.let {
                productAction.addToCart(it)
            }
        }
        buy.setOnClickListener {
            product?.let {
                productAction.addToCart(product)
                productOutwardNavigator.startPurchase(this, product)
            }
        }
    }
}