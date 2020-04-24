package com.seatcode.sdk.marsrovers.model

data class PlateauGrid(val topRightCorner: Coordinate) {

    var bottomLeftCorner = Coordinate(0, 0)

    fun isRoverInsideBounds(coordinate: Coordinate): Boolean {
        // TODO: Calculate correctly the bounds
        return true
    }

}