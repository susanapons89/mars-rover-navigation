package com.seatcode.sdk.marsrovers.model

/**
 * Direction
 * Enum class representing the four cardinal compass points
 * @author Susana Pons
 */
enum class Direction {
    N {
        override fun rotateLeft() = W
        override fun rotateRight() = E
        override fun moveCoordinate() = Coordinate(0, 1)
    },
    S {
        override fun rotateLeft() = E
        override fun rotateRight() = W
        override fun moveCoordinate() = Coordinate(0, -1)
    },
    E {
        override fun rotateLeft() = N
        override fun rotateRight() = S
        override fun moveCoordinate() = Coordinate(1, 0)
    },
    W {
        override fun rotateLeft() = S
        override fun rotateRight() = N
        override fun moveCoordinate() = Coordinate(-1, 0)
    };

    /**
     * Rotate 90º to the left
     */
    abstract fun rotateLeft(): Direction

    /**
     * Rotate 90º to the Right
     */
    abstract fun rotateRight(): Direction

    /**
     * Move one step forward
     */
    abstract fun moveCoordinate(): Coordinate
}