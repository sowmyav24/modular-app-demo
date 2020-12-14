package com.example.cart.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cart.domain.CartProduct
import com.example.util.formatPrice
import kotlinx.android.synthetic.main.cart_item.view.*
import java.text.DecimalFormat

class CartViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    val productName = itemView.product_name
    val productPrice = itemView.product_price
    val productQuantity = itemView.quantity

    fun setData(cartItem: CartProduct) {
        productName.text = cartItem.name
        productPrice.text = formatPrice(cartItem.price)
        productQuantity.text = "Total Quantity ${cartItem.quantity}"
    }
}
