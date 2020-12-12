package com.example.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CartAdapter(private val products: List<String>) :
    RecyclerView.Adapter<CartViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val cartView = inflater.inflate(R.layout.cart_item, parent, false)
        return CartViewHolder(cartView)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val product = products[position]
        holder.setData(product, 1, 12)
    }

}