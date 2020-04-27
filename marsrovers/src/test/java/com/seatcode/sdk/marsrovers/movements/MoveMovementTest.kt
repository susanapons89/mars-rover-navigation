package com.seatcode.sdk.marsrovers.movements


import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.seatcode.sdk.marsrovers.MarsRover
import org.junit.Test


class MoveMovementTest {

    @Test
    fun run_executeTheMarsRoversMove() {
        val marsRovers = mock<MarsRover>()
        val command = MoveMovement()
        command.run(marsRovers)
        verify(marsRovers).moveForward()
    }
}
