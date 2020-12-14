package com.example.purchase.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PurchaseProduct(val name: String, val price: Int): Parcelable
