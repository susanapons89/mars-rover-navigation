package com.seatcode.sdk.marsrovers.movements

import com.seatcode.sdk.marsrovers.MarsRover

/**
 * MoveMovement
 * Implementation of the IMovement interface to move one step on the corresponding direction
 * @author Susana Pons
 */
class MoveMovement:  IMovement{

    override fun run(marsRover: MarsRover) {
        marsRover.moveForward()
    }
}