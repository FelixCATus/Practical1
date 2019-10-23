package com.example.practical1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener { countUp() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }
    }

    private fun rollDice() {
        //Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        val drawableResource = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

        val drawableResource1 = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage1.setImageResource(drawableResource1)

        val drawableResource2 = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage2.setImageResource(drawableResource2)
    }

    private fun countUp() {
        val diceState = diceImage.drawable.constantState
        val diceState1 = diceImage1.drawable.constantState
        val diceState2 = diceImage2.drawable.constantState

        if(diceState == resources.getDrawable(R.drawable.empty_dice).constantState)
            diceImage.setImageResource(R.drawable.dice_1)
        else if(diceState == resources.getDrawable(R.drawable.dice_1).constantState)
            diceImage.setImageResource(R.drawable.dice_2)
        else if(diceState == resources.getDrawable(R.drawable.dice_2).constantState)
            diceImage.setImageResource(R.drawable.dice_3)
        else if(diceState == resources.getDrawable(R.drawable.dice_3).constantState)
            diceImage.setImageResource(R.drawable.dice_4)
        else if(diceState == resources.getDrawable(R.drawable.dice_4).constantState)
            diceImage.setImageResource(R.drawable.dice_5)
        else
            diceImage.setImageResource(R.drawable.dice_6)

        if(diceState1 == resources.getDrawable(R.drawable.empty_dice).constantState)
            diceImage1.setImageResource(R.drawable.dice_1)
        else if(diceState1 == resources.getDrawable(R.drawable.dice_1).constantState)
            diceImage1.setImageResource(R.drawable.dice_2)
        else if(diceState1 == resources.getDrawable(R.drawable.dice_2).constantState)
            diceImage1.setImageResource(R.drawable.dice_3)
        else if(diceState1 == resources.getDrawable(R.drawable.dice_3).constantState)
            diceImage1.setImageResource(R.drawable.dice_4)
        else if(diceState1 == resources.getDrawable(R.drawable.dice_4).constantState)
            diceImage1.setImageResource(R.drawable.dice_5)
        else
            diceImage1.setImageResource(R.drawable.dice_6)

        if(diceState2 == resources.getDrawable(R.drawable.empty_dice).constantState)
            diceImage2.setImageResource(R.drawable.dice_1)
        else if(diceState2 == resources.getDrawable(R.drawable.dice_1).constantState)
            diceImage2.setImageResource(R.drawable.dice_2)
        else if(diceState2 == resources.getDrawable(R.drawable.dice_2).constantState)
            diceImage2.setImageResource(R.drawable.dice_3)
        else if(diceState2 == resources.getDrawable(R.drawable.dice_3).constantState)
            diceImage2.setImageResource(R.drawable.dice_4)
        else if(diceState2 == resources.getDrawable(R.drawable.dice_4).constantState)
            diceImage2.setImageResource(R.drawable.dice_5)
        else
            diceImage2.setImageResource(R.drawable.dice_6)
    }

    private fun reset(){
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage1.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }
}