package com.seatcode.sdk.marsrovers.movements

import com.seatcode.sdk.marsrovers.MarsRovers

class RotateRightMovement:  IMovement{

    override fun run(marsRover: MarsRovers) {
        marsRover.rotateRight()
    }
}