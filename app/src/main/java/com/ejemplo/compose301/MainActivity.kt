package com.ejemplo.compose301

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0

        val mainView = findViewById<ConstraintLayout>(R.id.main)
        val counterValue = mainView.findViewById<TextView>(R.id.counter_value)
        val plusButton = mainView.findViewById<Button>(R.id.plus)
        val minusButton = mainView.findViewById<Button>(R.id.minus)

        plusButton.setOnClickListener {
            counter++
            counterValue.text = counter.toString()
        }

        minusButton.setOnClickListener {
            if (counter > 0) {
                counter--
            }
            counterValue.text = counter.toString()
        }

        // Inicializa el valor en pantalla
        counterValue.text = counter.toString()
    }
}