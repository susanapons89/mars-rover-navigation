package com.seatcode.sdk.marsrovers.model

data class PlateauGrid(val topRightCorner: Coordinate) {

    val bottomLeftCorner = Coordinate(0, 0)

    fun isRoverInsideBounds(coordinate: Coordinate) =
        coordinate.isCoordinateInsideRectangle(bottomLeftCorner, topRightCorner)

}