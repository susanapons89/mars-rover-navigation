package com.seatcode.sdk.marsrovers.utils

import com.seatcode.sdk.marsrovers.commands.ICommand
import com.seatcode.sdk.marsrovers.commands.MoveCommand
import com.seatcode.sdk.marsrovers.commands.RotatetLeftCommand
import com.seatcode.sdk.marsrovers.commands.RotatetRightCommand
import java.util.ArrayList

private val commandMap: HashMap<Char, ICommand> =
    hashMapOf('L' to RotatetLeftCommand(), 'R' to RotatetRightCommand(), 'M' to MoveCommand())

fun getCommands(stringCommands: String): ArrayList<ICommand> {
    val commands = arrayListOf<ICommand>()
    for (i in 0 .. stringCommands.length) {
        commandMap[stringCommands[i]]?.let {
            commands.add(it)
        }
    }
    return commands
}