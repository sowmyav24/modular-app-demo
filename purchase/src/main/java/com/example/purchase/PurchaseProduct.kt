package com.example.purchase

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PurchaseProduct(val name: String, val price: Int): Parcelable
