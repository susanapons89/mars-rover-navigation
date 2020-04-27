package com.seatcode.sdk.marsrovers

import com.google.gson.Gson
import com.seatcode.sdk.marsrovers.model.Coordinate
import com.seatcode.sdk.marsrovers.model.Direction
import com.seatcode.sdk.marsrovers.model.NavigationData
import com.seatcode.sdk.marsrovers.model.PlateauGrid
import com.seatcode.sdk.marsrovers.utils.getCommands

class MarsRovers(roverInformation: String) {

    private val navigationData: NavigationData = Gson().fromJson<NavigationData>(roverInformation,
        NavigationData::class.java)

    private var currentPosition: Coordinate
    private var currentDirection: Direction
    private var plateauGrid: PlateauGrid

    init {
        currentPosition = navigationData.roverPosition
        currentDirection = Direction.valueOf(navigationData.roverDirection)
        plateauGrid = PlateauGrid(navigationData.topRightCorner)
    }

    fun runAllMovements() : String {
        val commands = getCommands(navigationData.movements)
        commands.forEach {
            it.run(this)
        }
        return getCurrentPosition()
    }

    fun getCurrentPosition() = "$currentPosition $currentDirection"

    fun rotateLeft() {
        this.currentDirection = this.currentDirection.rotateLeft()
    }

    fun rotateRight() {
       this.currentDirection = this.currentDirection.rotateRight()
    }

    fun moveForward() {
        val tmpPosition = this.currentPosition.plus(this.currentDirection.moveCoordinate())
        if (plateauGrid.isRoverInsideBounds(tmpPosition)) {
            this.currentPosition = this.currentPosition.plus(this.currentDirection.moveCoordinate())
        }
    }
}