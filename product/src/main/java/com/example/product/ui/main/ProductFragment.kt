package com.example.product.ui.main

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.product.ProductDetailActivity
import com.example.product.R
import com.example.product.ui.main.adapter.ProductAdapter
import com.example.product.domain.Product
import com.example.product.ui.MainViewModel

class ProductFragment : Fragment(), ProductDetailListener {

    companion object {
        fun newInstance() = ProductFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val inflate = inflater.inflate(R.layout.product_fragment, container, false)
        val products = inflate.findViewById<View>(R.id.products) as RecyclerView
        val adapter = ProductAdapter(
            listOf(
                Product("Potato - Large 2Kg", 50),
                Product("Grapes - Green without seeds - 2Kg", 100)
            ), this
        )
        products.adapter = adapter
        products.layoutManager = LinearLayoutManager(requireContext())
        return inflate
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
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
