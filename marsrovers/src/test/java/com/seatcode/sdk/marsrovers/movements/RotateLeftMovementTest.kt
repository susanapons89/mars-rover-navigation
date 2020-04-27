package com.seatcode.sdk.marsrovers.movements


import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.seatcode.sdk.marsrovers.MarsRovers
import org.junit.Test


class RotateLeftMovementTest {

    @Test
    fun run_executeTheMarsRoversRotateLeft() {
        val marsRovers = mock<MarsRovers>()
        val command = RotateLeftMovement()
        command.run(marsRovers)
        verify(marsRovers).rotateLeft()
    }
}
