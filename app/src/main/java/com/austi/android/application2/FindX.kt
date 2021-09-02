package com.austi.android.application2

import android.content.ContentValues.TAG
import android.util.Log
import kotlin.math.sqrt

class FindX {
    val a: Double? = null
    val b: Double? = null
    val c: Double? = null

    fun calculateX(a: Double, b: Double, c: Double): String {
        var z: Double = b * b - (4 * a * c)
        if (z >= 0) {
            val x1 = (((-1) * b) + (sqrt(z))) / (2 * a)
            val x2 = (((-1) * b) - (sqrt(z))) / (2 * a)
            return "X = $x1 and X = $x2"
        }
        return "imaginary number"
    }
}