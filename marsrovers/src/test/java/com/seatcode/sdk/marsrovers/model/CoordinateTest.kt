package com.seatcode.sdk.marsrovers.model

import org.junit.Test

import org.junit.Assert.*


class CoordinateTest {

    @Test
    fun toString_correctlyFormatted() {
        val coordinate = Coordinate(2, 1)
        assertEquals("2 1", coordinate.toString())
    }

    @Test
    fun plus_sumEachAxisIndependently() {
        val coordinate = Coordinate(2, 1)
        val finalCoordinate = coordinate.plus(Coordinate(2, 5))
        assertEquals(4, finalCoordinate.x)
        assertEquals(6, finalCoordinate.y)
    }

    @Test
    fun isCoordinateInsideRectangle_success_returnsTrueWhenIsInside() {
        val coordinate = Coordinate(2, 1)
        assertTrue(coordinate.isCoordinateInsideRectangle(Coordinate(0,0), Coordinate(5, 5)))
    }

    @Test
    fun isCoordinateInsideRectangle_success_returnsFalseWhenIsOutside() {
        val coordinate = Coordinate(2, 1)
        assertFalse(coordinate.isCoordinateInsideRectangle(Coordinate(0,0), Coordinate(1, 1)))
    }

}
