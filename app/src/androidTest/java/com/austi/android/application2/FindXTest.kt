package com.austi.android.application2

import org.junit.Assert.*
import org.junit.Test

class FindXTest {

    @Test
    fun calculate_when_a_positive_b_negative_c_negative() {
        val findX = FindX()
        assertEquals("X = 3.0 and X = -2.0", findX.calculateX(1.0, -1.0, -6.0))
    }

    @Test
    fun calculate_when_a_negative_b_positive_c_positive() {
        val findX = FindX()
        assertEquals("X = -1.0 and X = 3.0", findX.calculateX(-1.0, 2.0, 3.0))
    }

    @Test
    fun calculate_when_a_positive_b_positive_c_positive() {
        val findX = FindX()
        assertEquals("X = -2.0 and X = -3.0", findX.calculateX(1.0, 5.0, 6.0))
    }

    @Test
    fun calculate_when_a_positive_b_negative_c_positive() {
        val findX = FindX()
        assertEquals("X = 1.0 and X = 1.0", findX.calculateX(1.0, -2.0, 1.0))
    }

    @Test
    fun calculate_when_a_negative_b_negative_c_negative() {
        val findX = FindX()
        assertEquals("X = -3.0 and X = -2.0", findX.calculateX(-1.0, -5.0, -6.0))
    }

    @Test
    fun calculate_when_a_negative_b_positive_c__negative() {
        val findX = FindX()
        assertEquals("X = 1.0 and X = 1.0", findX.calculateX(-1.0, 2.0, -1.0))
    }

    @Test
    fun calculate_when_a_negative_b_negative_c_positive() {
        val findX = FindX()
        assertEquals("X = -3.0 and X = 2.0", findX.calculateX(-1.0, -1.0, 6.0))
    }

    @Test
    fun calculate_when_a_positive_b_positive_c_negative() {
        val findX = FindX()
        assertEquals("X = 2.0 and X = -3.0", findX.calculateX(1.0, 1.0, -6.0))
    }

    @Test
    fun calculate_when_imaginary_number() {
        val findX = FindX()
        assertEquals("imaginary number", findX.calculateX(1.0, 1.0, 1.0))
    }
}
