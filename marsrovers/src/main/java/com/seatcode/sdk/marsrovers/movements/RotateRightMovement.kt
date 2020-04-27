package com.seatcode.sdk.marsrovers.movements

import com.seatcode.sdk.marsrovers.MarsRover

/**
 * RotateRightMovement
 * Implementation of the IMovement interface to rotate 90º to the right
 * @author Susana Pons
 */
class RotateRightMovement:  IMovement{

    override fun run(marsRover: MarsRover) {
        marsRover.rotateRight()
    }
}