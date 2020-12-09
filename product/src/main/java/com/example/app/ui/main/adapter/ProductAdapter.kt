package com.example.app.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.product.R
import com.example.app.domain.Product
import com.example.app.ui.viewHolder.ProductViewHolder

class ProductAdapter(private val products: List<Product>) :
    RecyclerView.Adapter<ProductViewHolder>(), BuyNowListener {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val productView = inflater.inflate(R.layout.product_item, parent, false)
        return ProductViewHolder(productView, this)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product: Product = products[position]
        holder.setData(product)
    }

    override fun onBuyNow(position: Int) {
        // TODO
    }
}

interface BuyNowListener {
    fun onBuyNow(position: Int)
}
