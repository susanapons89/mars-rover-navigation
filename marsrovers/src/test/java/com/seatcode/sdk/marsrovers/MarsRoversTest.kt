package com.seatcode.sdk.marsrovers

import org.junit.Test

import org.junit.Assert.*


class MarsRoversTest {

    val inputData = "{\"topRightCorner\":{\"x\":5,\"y\":5},\"roverPosition\":{\"x\":1,\"y\":2},\"roverDirection\":\"N\",\"movements\":\"LMLMLMLMM\"}"

    @Test
    fun runAllMovements_success_shouldReturnFinalPosition() {
        val marsRovers = MarsRovers(inputData)
        val output = marsRovers.runAllMovements()
        assertEquals("1 3 N", output)
    }

    @Test
    fun runAllMovements_success_unkownMovementIsIgnored() {
        val marsRovers = MarsRovers("{\"topRightCorner\":{\"x\":5,\"y\":5},\"roverPosition\":{\"x\":1,\"y\":2},\"roverDirection\":\"N\",\"movements\":\"S\"}")
        val output = marsRovers.runAllMovements()
        assertEquals("1 2 N", output)
    }

    @Test
    fun rotateLeft_success_changesDirectionCorrectly() {
        val marsRovers = MarsRovers(inputData)
        marsRovers.rotateLeft()
        assertEquals("1 2 W", marsRovers.getCurrentPosition())
    }

    @Test
    fun rotateRight_success_changesDirectionCorrectly() {
        val marsRovers = MarsRovers(inputData)
        marsRovers.rotateRight()
        assertEquals("1 2 E", marsRovers.getCurrentPosition())
    }

    @Test
    fun moveForward_success_changesPositionCorrectly() {
        val marsRovers = MarsRovers(inputData)
        marsRovers.moveForward()
        assertEquals("1 3 N", marsRovers.getCurrentPosition())
    }

    @Test
    fun moveForward_successWhenOutsideGrid_shouldNotMove() {
        val marsRovers = MarsRovers("{\"topRightCorner\":{\"x\":5,\"y\":5},\"roverPosition\":{\"x\":1,\"y\":5},\"roverDirection\":\"N\",\"movements\":\"LMLMLMLMM\"}")
        marsRovers.moveForward()
        assertEquals("1 5 N", marsRovers.getCurrentPosition())
    }
}
