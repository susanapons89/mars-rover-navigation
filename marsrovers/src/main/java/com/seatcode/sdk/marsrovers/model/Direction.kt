package com.seatcode.sdk.marsrovers.model

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


    abstract fun rotateLeft(): Direction
    abstract fun rotateRight(): Direction
    abstract fun moveCoordinate(): Coordinate
}