package com.seatcode.sdk.marsrovers.commands

import com.seatcode.sdk.marsrovers.MarsRovers

interface ICommand {
    fun run(marsRover: MarsRovers)
}