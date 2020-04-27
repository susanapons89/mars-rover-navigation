package com.seatcode.sdk.marsrovers.movements

import com.seatcode.sdk.marsrovers.MarsRovers

class RotateLeftMovement:  IMovement{

    override fun run(marsRover: MarsRovers) {
        marsRover.rotateLeft()
    }
}