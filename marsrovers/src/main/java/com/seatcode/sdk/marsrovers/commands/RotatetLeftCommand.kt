package com.seatcode.sdk.marsrovers.commands

import com.seatcode.sdk.marsrovers.MarsRovers

class RotatetLeftCommand:  ICommand{

    override fun run(marsRover: MarsRovers) {
        marsRover.rotateLeft()
    }
}