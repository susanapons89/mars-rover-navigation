package com.seatcode.sdk.marsrovers.commands

import com.seatcode.sdk.marsrovers.MarsRovers

class RotatetRightCommand:  ICommand{

    override fun run(marsRover: MarsRovers) {
        marsRover.rotateRight()
    }
}