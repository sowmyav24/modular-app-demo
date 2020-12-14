package com.example.product.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.product.domain.Product
import kotlinx.android.synthetic.main.product_item.view.*

class ProductViewHolder(itemView: View, onClick: (Int) -> Unit) :
    RecyclerView.ViewHolder(itemView) {

    init {
        itemView.product_item.setOnClickListener {
            onClick(adapterPosition)
        }
    }

    fun setData(product: Product) {
        itemView.product_name.text = product.name
        itemView.product_price.text = product.price.toString()
    }
}
