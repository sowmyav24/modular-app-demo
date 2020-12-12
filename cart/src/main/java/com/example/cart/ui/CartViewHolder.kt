package com.example.cart.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cart.domain.CartProduct
import kotlinx.android.synthetic.main.cart_item.view.*

class CartViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    val productName = itemView.product_name
    val productPrice = itemView.product_price
    val productQuantity = itemView.quantity

    fun setData(cartItem: CartProduct) {
        productName.text = cartItem.name
        productPrice.text = cartItem.price.toString()
        productQuantity.text = "Total Quantity ${cartItem.quantity}"
    }
}
