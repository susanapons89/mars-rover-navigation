package com.seatcode.sdk.marsrovers.movements

import com.seatcode.sdk.marsrovers.MarsRover

/**
 * IMovement
 * Interface for any kind of Movement
 * @author Susana Pons
 */
interface IMovement {
    /**
     * Run the corresponding movement on the Mars Rover
     */
    fun run(marsRover: MarsRover)
}