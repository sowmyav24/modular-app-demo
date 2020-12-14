package com.example.product.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.product.R
import com.example.product.domain.Product

class ProductAdapter(
    private val products: List<Product>,
    private val onClick: (Product) -> Unit
) :
    RecyclerView.Adapter<ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val productView = inflater.inflate(R.layout.product_item, parent, false)
        return ProductViewHolder(productView, this::onProductClick)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product: Product = products[position]
        holder.setData(product)
    }

    private fun onProductClick(position: Int) {
        onClick(products[position])
    }

}

