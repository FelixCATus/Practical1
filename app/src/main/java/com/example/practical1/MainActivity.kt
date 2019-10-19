package com.example.practical1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        //Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        if (resultText.text == "Hello World!"){
            resultText.text = "1"
        }else {
            var resultInt = resultText.text.toString().toInt()
            if (resultText.text != "6") {
                resultText.text = resultInt.inc().toString()
            }
            else{
                Toast.makeText(this, "Number has reached 6!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
