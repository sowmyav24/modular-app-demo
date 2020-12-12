package com.example.cart.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cart.R
import com.example.cart.viewmodel.CartViewModel
import kotlinx.android.synthetic.main.cart_fragment.cost

class CartFragment : Fragment() {

    companion object {
        fun newInstance() = CartFragment()
    }

    private lateinit var viewModel: CartViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(CartViewModel::class.java)
        val inflate = inflater.inflate(R.layout.cart_fragment, container, false)
        val products = inflate.findViewById<View>(R.id.cart_products) as RecyclerView
        val adapter = CartAdapter(
            viewModel.getAllCartItems()
        )
        products.adapter = adapter
        products.layoutManager = LinearLayoutManager(requireContext())
        return inflate
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cost.text = "${getString(R.string.total_cost)}${viewModel.getTotalCost()}"
    }

}
