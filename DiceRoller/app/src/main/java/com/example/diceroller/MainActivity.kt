package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        //Do a dice roll when the app starts
        rollDice()
    }

    /**
     * Roll the dice and update the screen with the result.
     * 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
     */
    private fun rollDice() {
        //Create new Dice object with 6 sides and roll the dice
        val dice = Dice(6)
        val dice2=Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2=dice2.roll()

        // Find the ImageView in the layout
        val diceImage:ImageView=findViewById(R.id.imageView)
        val diceImage2:ImageView=findViewById(R.id.imageView3)

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource= when(diceRoll){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else-> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

        // Update the content description
        diceImage.contentDescription = diceRoll.toString()

        val drawableResource2= when(diceRoll2){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else-> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        diceImage2.setImageResource(drawableResource2)

        // Update the content description
        diceImage2.contentDescription = diceRoll2.toString()

    }

    /**
     * Dice class to be used in rollDice function
     */
    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}
