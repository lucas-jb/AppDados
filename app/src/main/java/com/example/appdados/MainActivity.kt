package com.example.appdados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button);
        var labelt = findViewById<TextView>(R.id.infodado)
        var imaged = findViewById<ImageView>(R.id.imageView)
        button.setOnClickListener(){
            var num = (1..6).random();
            labelt.text = num.toString();
            when(num){
                1 -> imaged.setImageResource(R.drawable.dice_1);
                2 -> imaged.setImageResource(R.drawable.dice_2);
                3 -> imaged.setImageResource(R.drawable.dice_3);
                4 -> imaged.setImageResource(R.drawable.dice_4);
                5 -> imaged.setImageResource(R.drawable.dice_5);
                6 -> imaged.setImageResource(R.drawable.dice_6);
            }
        }
    }
}