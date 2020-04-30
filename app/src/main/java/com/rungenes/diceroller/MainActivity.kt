package com.rungenes.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var imageViewDice:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRoll:Button = findViewById(R.id.roll_button)


        buttonRoll.setOnClickListener {
            rollDice()
        }

        imageViewDice = findViewById(R.id.imageViewDice)
    }

    private fun rollDice() {

        val randomValue = Random().nextInt(9)+1
       val drawableImageResource = when(randomValue){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        imageViewDice.setImageResource(drawableImageResource)
    }
}
