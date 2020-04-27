package com.seatcode.sdk.marsrovers.model

/**
 * PlateauGrid
 * Represent the Plateu
 * @author Susana Pons
 * @param topRightCorner Indicates the upper-right coordinates of the plateau.
 */
data class PlateauGrid(val topRightCorner: Coordinate) {

    private val bottomLeftCorner = Coordinate(0, 0)

    /**
     * Check if coordinate is inside the Plateau
     * @param coordinate Point to check if it is inside
     * @return true if coordinate is inside the plateau
     */
    fun isRoverInsideBounds(coordinate: Coordinate) =
        coordinate.isCoordinateInsideRectangle(bottomLeftCorner, topRightCorner)

}