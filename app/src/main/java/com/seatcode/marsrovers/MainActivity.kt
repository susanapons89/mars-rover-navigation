package com.seatcode.marsrovers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seatcode.sdk.marsrovers.MarsRover
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val marsRover = MarsRover(
            "{\"topRightCorner\":{\"x\":5,\"y\":5},\"roverPosition\":{\"x\":1,\"y\":2},\"roverDirection\":\"N\",\"movements\":\"LMLMLMLMM\"}")

        libraryOutput.text = marsRover.runAllMovements()
    }
}
