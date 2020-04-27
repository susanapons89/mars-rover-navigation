package com.seatcode.sdk.marsrovers.movements


import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.seatcode.sdk.marsrovers.MarsRovers
import org.junit.Test


class MoveMovementTest {

    @Test
    fun run_executeTheMarsRoversMove() {
        val marsRovers = mock<MarsRovers>()
        val command = MoveMovement()
        command.run(marsRovers)
        verify(marsRovers).moveForward()
    }
}
