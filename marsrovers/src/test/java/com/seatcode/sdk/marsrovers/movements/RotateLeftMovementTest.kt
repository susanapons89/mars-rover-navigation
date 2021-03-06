package com.seatcode.sdk.marsrovers.movements


import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.seatcode.sdk.marsrovers.MarsRover
import org.junit.Test


class RotateLeftMovementTest {

    @Test
    fun run_executeTheMarsRoversRotateLeft() {
        val marsRovers = mock<MarsRover>()
        val command = RotateLeftMovement()
        command.run(marsRovers)
        verify(marsRovers).rotateLeft()
    }
}
