package com.seatcode.sdk.marsrovers.model

import org.junit.Test

import org.junit.Assert.*


class DirectionTest {

    @Test
    fun rotateLeftFromNotrthReturnsWest() {
        val direction = Direction.N
        assertEquals(Direction.W, direction.rotateLeft())
    }

    @Test
    fun rotateRightFromNotrthReturnsEast() {
        val direction = Direction.N
        assertEquals(Direction.E, direction.rotateRight())
    }

    @Test
    fun moveCoordinateFromNotrthReturnsOneYStep() {
        val direction = Direction.N
        assertEquals(1, direction.moveCoordinate().y)
        assertEquals(0, direction.moveCoordinate().x)
    }

    @Test
    fun rotateLeftFromSouthReturnsEast() {
        val direction = Direction.S
        assertEquals(Direction.E, direction.rotateLeft())
    }

    @Test
    fun rotateRightFromSouthReturnsWest() {
        val direction = Direction.S
        assertEquals(Direction.W, direction.rotateRight())
    }

    @Test
    fun moveCoordinateFromSouthReturnsOneNegativeYStep() {
        val direction = Direction.S
        assertEquals(-1, direction.moveCoordinate().y)
        assertEquals(0, direction.moveCoordinate().x)
    }

    @Test
    fun rotateLeftFromEastReturnsNorth() {
        val direction = Direction.E
        assertEquals(Direction.N, direction.rotateLeft())
    }

    @Test
    fun rotateRightFromSouthReturnsSouth() {
        val direction = Direction.E
        assertEquals(Direction.S, direction.rotateRight())
    }

    @Test
    fun moveCoordinateFromSouthReturnsOneXStep() {
        val direction = Direction.E
        assertEquals(0, direction.moveCoordinate().y)
        assertEquals(1, direction.moveCoordinate().x)
    }

    @Test
    fun rotateLeftFromWestReturnsSouth() {
        val direction = Direction.W
        assertEquals(Direction.S, direction.rotateLeft())
    }

    @Test
    fun rotateRightFromWestReturnsNorth() {
        val direction = Direction.W
        assertEquals(Direction.N, direction.rotateRight())
    }

    @Test
    fun moveCoordinateFromWestReturnsOneNegativeXStep() {
        val direction = Direction.W
        assertEquals(0, direction.moveCoordinate().y)
        assertEquals(-1, direction.moveCoordinate().x)
    }


}
