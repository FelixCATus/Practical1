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

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetNum() }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)

        //Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        resultText.text = (Random().nextInt(6) + 1).toString()
        resultText1.text = (Random().nextInt(6) + 1).toString()
        resultText2.text = (Random().nextInt(6) + 1).toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)

        if (resultText.text == ""){
            resultText.text = "1"
        }else {
            val resultInt = resultText.text.toString().toInt()
            if (resultText.text != "6") {
                resultText.text = resultInt.inc().toString()
            }
        }

        if (resultText1.text == "Hello World!"){
            resultText1.text = "1"
        }else {
            val resultInt = resultText1.text.toString().toInt()
            if (resultText1.text != "6") {
                resultText1.text = resultInt.inc().toString()
            }
        }

        if (resultText2.text == ""){
            resultText2.text = "1"
        }else {
            val resultInt = resultText2.text.toString().toInt()
            if (resultText2.text != "6") {
                resultText2.text = resultInt.inc().toString()
            }
        }
    }

    private fun resetNum(){
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)

        resultText.text = "0"
        resultText1.text = "0"
        resultText2.text = "0"
    }
}
