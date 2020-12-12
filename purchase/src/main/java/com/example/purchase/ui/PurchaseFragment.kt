package com.example.purchase.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.purchase.viewmodel.PurchaseViewModel
import com.example.purchase.R
import kotlinx.android.synthetic.main.purchase_fragment.*

class PurchaseFragment : Fragment() {

    companion object {
        fun newInstance() = PurchaseFragment()
    }

    private lateinit var viewModel: PurchaseViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(PurchaseViewModel::class.java)
        return inflater.inflate(R.layout.purchase_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        complete_purchase.setOnClickListener {
            // TODO
        }
    }

}