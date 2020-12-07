package com.example.shoppingapp.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingapp.R
import com.example.shoppingapp.ui.main.adapter.ProductAdapter
import com.example.shoppingapp.domain.Product

class ProductFragment : Fragment() {

    companion object {
        fun newInstance() = ProductFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val inflate = inflater.inflate(R.layout.product_fragment, container, false)
        val rvContacts = inflate.findViewById<View>(R.id.products) as RecyclerView
        val adapter = ProductAdapter(
            listOf(
                Product("Milk", "20"),
                Product("Bread", "12")
            )
        )
        rvContacts.adapter = adapter
        rvContacts.layoutManager = LinearLayoutManager(this.activity)
        return inflate;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

}