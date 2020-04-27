package com.seatcode.sdk.marsrovers.model

/**
 * NavigationData
 * Represents initial input data
 * @author Susana Pons
 */
data class NavigationData(
    val  topRightCorner: Coordinate,
    val roverPosition: Coordinate,
    val roverDirection: String,
    val movements: String)