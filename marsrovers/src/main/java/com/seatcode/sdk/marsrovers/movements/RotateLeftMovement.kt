package com.seatcode.sdk.marsrovers.movements

import com.seatcode.sdk.marsrovers.MarsRover


/**
 * RotateLeftMovements
 * Implementation of the IMovement interface to rotate 90º to the left
 * @author Susana Pons
 */
class RotateLeftMovement:  IMovement{

    override fun run(marsRover: MarsRover) {
        marsRover.rotateLeft()
    }
}