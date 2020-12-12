package com.example.cart

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cart_item.view.*

class CartViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    val productName = itemView.product_name
    val productPrice = itemView.product_price
    val productQuantity = itemView.quantity

    fun setData(name: String, price: Int, quantity: Int) {
        productName.text = name
        productPrice.text = price.toString()
        productQuantity.text = "Total Quantity $quantity"
    }
}
