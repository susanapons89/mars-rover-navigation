package com.seatcode.sdk.marsrovers.utils

import com.seatcode.sdk.marsrovers.movements.IMovement
import com.seatcode.sdk.marsrovers.movements.MoveMovement
import com.seatcode.sdk.marsrovers.movements.RotateLeftMovement
import com.seatcode.sdk.marsrovers.movements.RotateRightMovement
import java.util.ArrayList

private val MOVEMENT_MAP: HashMap<Char, IMovement> =
    hashMapOf('L' to RotateLeftMovement(), 'R' to RotateRightMovement(), 'M' to MoveMovement())

/**
 * Convert the string input to an array of movements
 * @param stringCommands The movements to parse
 * @return an Array with all the pardes movements
 */
fun getMovements(stringCommands: String): ArrayList<IMovement> {
    val commands = arrayListOf<IMovement>()
    for (element in stringCommands) {
        MOVEMENT_MAP[element]?.let {
            commands.add(it)
        }
    }
    return commands
}