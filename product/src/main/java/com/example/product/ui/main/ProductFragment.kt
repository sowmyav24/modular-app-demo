package com.example.product.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.product.ProductDetailActivity
import com.example.product.R
import com.example.product.domain.Product
import com.example.product.ui.main.adapter.ProductAdapter
import com.example.product.viewmodel.ProductViewModel

class ProductFragment : Fragment(), ProductDetailListener {

    companion object {
        fun newInstance() = ProductFragment()
    }

    private lateinit var viewModel: ProductViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(ProductViewModel::class.java)
        val inflate = inflater.inflate(R.layout.product_fragment, container, false)
        val products = inflate.findViewById<View>(R.id.products) as RecyclerView
        val category = arguments?.getString("category") ?: "Grocery"
        val productList = viewModel.getProducts(category)
        val adapter = ProductAdapter(productList, this)
        products.adapter = adapter
        products.layoutManager = LinearLayoutManager(requireContext())
        return inflate
    }

    override fun onProductDetailClick(product: Product) {
        val intent = Intent(context, ProductDetailActivity::class.java)
        intent.putExtra("name", product.name)
        intent.putExtra("price", product.price)
        startActivity(intent)
    }
}

interface ProductDetailListener {
    fun onProductDetailClick(product: Product)
}
