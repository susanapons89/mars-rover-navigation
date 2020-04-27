package com.seatcode.sdk.marsrovers

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MarsRoversTest {

    @Test
    fun runAllMovements_success_shouldReturnFinalPosition() {
        val marsRovers = MarsRovers("{\"topRightCorner\":{\"x\":5,\"y\":5},\"roverPosition\":{\"x\":1,\"y\":2},\"roverDirection\":\"N\",\"movements\":\"LMLMLMLMM\"}")
        val output = marsRovers.runAllMovements()
        assertEquals("1 3 N", output)
    }
}
