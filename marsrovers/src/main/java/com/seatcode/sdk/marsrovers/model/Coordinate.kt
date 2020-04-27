package com.seatcode.sdk.marsrovers.model

/**
 * Coordinate
 * Class to represent a 2D point into a grid
 * @author Susana Pons
 */
data class Coordinate (val x: Int, val y: Int) {

    /**
     * Convert Coordinate to String
     * @return Coordinate separating X and Y by space
     */
    override fun toString(): String {
        return "${this.x} ${this.y}"
    }

    /**
     * Sum X and Y point separately
     */
    operator fun plus(coordinate: Coordinate) =
        Coordinate(x + coordinate.x, y + coordinate.y)

    /**
     * Check if the correct is inside a rectangle
     * @param bottomLeftCorner Bottom left Corner position of the rectangle
     * @param topRightCorner Top right corner position of the rectangle
     * @return true is coordinate is inside rectangle
     */
    fun isCoordinateInsideRectangle(bottomLeftCorner: Coordinate, topRightCorner: Coordinate) =
        (x - bottomLeftCorner.x) >= 0 &&
                (y - bottomLeftCorner.y) >= 0 &&
                (topRightCorner.x - x) >= 0 &&
                (topRightCorner.y - y) >= 0

}