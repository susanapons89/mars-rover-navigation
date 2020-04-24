package com.seatcode.sdk.marsrovers

import com.google.gson.Gson
import com.seatcode.sdk.marsrovers.model.Coordinate
import com.seatcode.sdk.marsrovers.model.Direction
import com.seatcode.sdk.marsrovers.model.NavigationData
import com.seatcode.sdk.marsrovers.utils.getCommands

class MarsRovers(roverInformation: String) {

    val navigationData = Gson().fromJson<NavigationData>(roverInformation,
        NavigationData::class.java)

    var currentPosition: Coordinate
    var currentDirection: Direction

    init {
        currentPosition = navigationData.roverPosition
        currentDirection = Direction.valueOf(navigationData.roverDirection)
    }

    fun getFinalCoordinates() : String {
        val commands = getCommands(navigationData.movements)
        commands.forEach {
            it.run(this)
        }

        return "$currentPosition $currentDirection"
    }

    fun rotateLeft() {
        this.currentDirection = this.currentDirection.rotateLeft()
    }

    fun rotateRight() {
       this.currentDirection = this.currentDirection.rotateRight()
    }

    fun moveForward() {
        // TODO: Move on the correct direction
        this.currentPosition = this.currentPosition.plus(this.currentDirection.moveCoordinate())
    }


}