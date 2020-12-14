package com.example.purchase.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

@Parcelize
data class PurchaseProduct(val name: String, val price: BigDecimal): Parcelable
