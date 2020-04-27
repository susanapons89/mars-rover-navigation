package com.seatcode.sdk.marsrovers.model

data class Coordinate (val x: Int, val y: Int) {

    override fun toString(): String {
        return "${this.x} ${this.y}"
    }

    operator fun plus(coordinate: Coordinate) =
        Coordinate(x + coordinate.x, y + coordinate.y)

    fun isCoordinateInsideRectangle(bottomLeftCorner: Coordinate, topRightCorner: Coordinate) =
        (x - bottomLeftCorner.x) >= 0 &&
                (y - bottomLeftCorner.y) >= 0 &&
                (topRightCorner.x - x) >= 0 &&
                (topRightCorner.y - y) >= 0

}