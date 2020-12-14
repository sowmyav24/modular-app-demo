package com.example.util

import java.math.BigDecimal
import java.text.DecimalFormat

fun formatPrice(price: BigDecimal): String {
    return DecimalFormat("###0.00").format(price)
}