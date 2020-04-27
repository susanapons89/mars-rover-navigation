package com.seatcode.sdk.marsrovers

import com.google.gson.Gson
import com.seatcode.sdk.marsrovers.model.Coordinate
import com.seatcode.sdk.marsrovers.model.Direction
import com.seatcode.sdk.marsrovers.model.NavigationData
import com.seatcode.sdk.marsrovers.model.PlateauGrid
import com.seatcode.sdk.marsrovers.utils.getMovements


/**
 * MarsRover
 * Main class for the Mars Rovers Library.
 * @author Susana Pons
 */
class MarsRover(roverInformation: String) {

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

    /**
     * Run all the movements given on the initialization of the Class.
     * @return A String representing the final position and direction of the Rover
     */
    fun runAllMovements() : String {
        val movements = getMovements(navigationData.movements)
        movements.forEach {
            it.run(this)
        }
        return getCurrentPosition()
    }

    /**
     * Get Current position
     * @return a String representing the current position of the Rover
     */
    fun getCurrentPosition() = "$currentPosition $currentDirection"

    /**
     * Rotate the Rover 90º to the left
     */
    fun rotateLeft() {
        this.currentDirection = this.currentDirection.rotateLeft()
    }

    /**
     * Rotate the rover 90º to the right
     */
    fun rotateRight() {
       this.currentDirection = this.currentDirection.rotateRight()
    }

    /**
     * Move on step on the current rover direction.
     * Only move if the rovers stays inside the plateau afterwards
     */
    fun moveForward() {
        val tmpPosition = this.currentPosition.plus(this.currentDirection.moveCoordinate())
        if (plateauGrid.isRoverInsideBounds(tmpPosition)) {
            this.currentPosition = this.currentPosition.plus(this.currentDirection.moveCoordinate())
        }
    }
}