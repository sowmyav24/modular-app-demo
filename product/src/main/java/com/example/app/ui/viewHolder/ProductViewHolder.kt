package com.example.app.ui.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.app.domain.Product
import com.example.app.ui.main.adapter.BuyNowListener
import kotlinx.android.synthetic.main.product_item.view.buy
import kotlinx.android.synthetic.main.product_item.view.product_name
import kotlinx.android.synthetic.main.product_item.view.product_price

class ProductViewHolder(itemView: View, buyNowListener: BuyNowListener) : RecyclerView.ViewHolder(itemView) {
    val productName = itemView.product_name
    val productPrice = itemView.product_price
    private val buyNow = itemView.buy.setOnClickListener {
        buyNowListener.onBuyNow(adapterPosition);
    }

    fun setData(product: Product) {
        productName.text = product.name
        productPrice.text = product.price
     }
}
