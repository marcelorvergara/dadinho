package com.example.dadinho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn6.setOnClickListener{ rollDice(6) }

        btn4.setOnClickListener{ rollDice(4) }

        btn10.setOnClickListener{ rollDice(10) }

        btn20.setOnClickListener{ rollDice(20) }
        }

    fun rollDice (num: Int){
        val randomInt = Random.nextInt(num)+1
        result.text = randomInt.toString()
        val enum = randomInt.toString()
        resultados.text = "\tDado $num : $enum \n" + resultados.text
    }
}
