package com.example.product.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.product.domain.Product
import kotlinx.android.synthetic.main.product_item.view.product_item
import kotlinx.android.synthetic.main.product_item.view.product_name
import kotlinx.android.synthetic.main.product_item.view.product_price

class ProductViewHolder(itemView: View, productListener: ProductListener) :
    RecyclerView.ViewHolder(itemView) {
    val productName = itemView.product_name
    val productPrice = itemView.product_price

    private val itemClick = itemView.product_item.setOnClickListener {
        productListener.onProductClick(adapterPosition);
    }

    fun setData(product: Product) {
        productName.text = product.name
        productPrice.text = product.price.toString()
    }
}
