package com.seatcode.sdk.marsrovers.commands

import com.seatcode.sdk.marsrovers.MarsRovers

class MoveCommand:  ICommand{

    override fun run(marsRover: MarsRovers) {
        marsRover.moveForward()
    }
}