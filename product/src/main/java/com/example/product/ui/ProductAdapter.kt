package com.example.product.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.product.ProductDetailListener
import com.example.product.R
import com.example.product.domain.Product

class ProductAdapter(private val products: List<Product>, val productDetailListener: ProductDetailListener) :
    RecyclerView.Adapter<ProductViewHolder>(),
    ProductListener {

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

    override fun onProductClick(position: Int) {
        productDetailListener.onProductDetailClick(products[position])
    }


}

interface ProductListener {
    fun onProductClick(position: Int)
}
