package com.example.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CartAdapter(private val cartItems: List<CartItem>) :
    RecyclerView.Adapter<CartViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val cartView = inflater.inflate(R.layout.cart_item, parent, false)
        return CartViewHolder(cartView)
    }

    override fun getItemCount(): Int {
        return cartItems.size
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val cartItem = cartItems[position]
        holder.setData(cartItem)
    }

}