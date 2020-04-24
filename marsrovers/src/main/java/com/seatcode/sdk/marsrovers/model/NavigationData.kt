package com.seatcode.sdk.marsrovers.model

data class NavigationData(
    val  topRightCorner: Coordinate,
    val roverPosition: Coordinate,
    val roverDirection: String,
    val movements: String)