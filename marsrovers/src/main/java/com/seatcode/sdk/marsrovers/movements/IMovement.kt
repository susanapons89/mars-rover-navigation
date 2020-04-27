package com.seatcode.sdk.marsrovers.movements

import com.seatcode.sdk.marsrovers.MarsRovers

interface IMovement {
    fun run(marsRover: MarsRovers)
}