package com.seatcode.sdk.marsrovers.model

import org.junit.Test

import org.junit.Assert.*


class PlateauGridTest {

    @Test
    fun isRoverInsideBounds_successIsInside_returnsTrue() {
        val plateauGrid = PlateauGrid(Coordinate(5, 5))
        assertTrue(plateauGrid.isRoverInsideBounds(Coordinate(2, 3)))
    }

    @Test
    fun isRoverInsideBounds_successIsOutside_returnsFalse() {
        val plateauGrid = PlateauGrid(Coordinate(5, 5))
        assertFalse(plateauGrid.isRoverInsideBounds(Coordinate(6, 3)))
    }

    @Test
    fun isRoverInsideBounds_successIsOnLimit_returnsTrue() {
        val plateauGrid = PlateauGrid(Coordinate(5, 5))
        assertTrue(plateauGrid.isRoverInsideBounds(Coordinate(5, 5)))
    }

}
