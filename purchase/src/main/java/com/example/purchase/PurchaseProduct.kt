package com.example.purchase

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class PurchaseProduct(val name: String) : Serializable, Parcelable
