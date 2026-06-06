package com.example.ci_cd

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun add_returnsCorrectResult() {
        val result = calculator.add(2, 3)

        assertEquals(5, result)
    }

    @Test
    fun divide_returnsCorrectResult() {
        val result = calculator.divide(10, 2)

        assertEquals(5, result)
    }

    @Test
    fun divide_byZero_throwsException() {
        assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(10, 0)
        }
    }
}