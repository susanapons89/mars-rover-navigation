package com.seatcode.sdk.marsrovers.utils

import com.seatcode.sdk.marsrovers.movements.MoveMovement
import com.seatcode.sdk.marsrovers.movements.RotateLeftMovement
import com.seatcode.sdk.marsrovers.movements.RotateRightMovement
import org.junit.Test

import org.junit.Assert.*


class ParseMovementsTest {

    @Test
    fun getMovements_parsesLtoRotateLeftMovement() {
       val movements = getMovements("L")
        assertEquals(1, movements.size)
        assertTrue(movements[0] is RotateLeftMovement)
    }

    @Test
    fun getMovements_parsesRtoRotateRightMovement() {
        val movements = getMovements("R")
        assertEquals(1, movements.size)
        assertTrue(movements[0] is RotateRightMovement)
    }

    @Test
    fun getMovements_parsesMtoMoveMovement() {
        val movements = getMovements("M")
        assertEquals(1, movements.size)
        assertTrue(movements[0] is MoveMovement)
    }

    @Test
    fun getMovements_parsesWrongMovementAsEmpyList() {
        val movements = getMovements("S")
        assertEquals(0, movements.size)
    }

    @Test
    fun getMovements_ignoreWrongMovement() {
        val movements = getMovements("MS")
        assertEquals(1, movements.size)
        assertTrue(movements[0] is MoveMovement)
    }

    @Test
    fun getMovements_parseCorrectlyMultipleMovements() {
        val movements = getMovements("MLR")
        assertEquals(3, movements.size)
        assertTrue(movements[0] is MoveMovement)
        assertTrue(movements[1] is RotateLeftMovement)
        assertTrue(movements[2] is RotateRightMovement)
    }

}
