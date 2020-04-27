package com.seatcode.sdk.marsrovers.movements

import com.seatcode.sdk.marsrovers.MarsRovers

class MoveMovement:  IMovement{

    override fun run(marsRover: MarsRovers) {
        marsRover.moveForward()
    }
}