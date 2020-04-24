package com.seatcode.sdk.marsrovers.model

data class Coordinate (val x: Int, val y: Int) {

    override fun toString(): String {
        return "${this.x} ${this.y}"
    }

    operator fun plus(coordinate: Coordinate) =
        Coordinate(x + coordinate.x, y + coordinate.y)

}