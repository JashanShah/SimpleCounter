package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.adder)
        val textView = findViewById<TextView>(R.id.counter)
        val upgradeButton = findViewById<Button>(R.id.upgradeBtn)

        button.setOnClickListener {
            //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++
            textView.text = counter.toString()

            //Showing the upgrade button
            if( counter >= 100)
            {
                upgradeButton.visibility = View.VISIBLE
                upgradeButton.setOnClickListener {
                    button.text = "Add 2"   //Changes the name of the first button

                    //Make it add 2 instead of 1
                    button.setOnClickListener {
                        counter += 2
                        textView.text = counter.toString()
                    }

                    //Hides the button again
                    upgradeButton.visibility = View.INVISIBLE
                }
            }
        }
    }
}