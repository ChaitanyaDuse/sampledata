package com.shunya.sampledata

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun additionUtil() {
        val i : Int = 0
        val j : Int = 10
        val sum = i + j
        assertEquals(sum, Util.addTwoNums(i, j))


    }
}
