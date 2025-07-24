package com.example.linearlayout

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Textview
        val textViewUi = findViewById<TextView>(R.id.textView)

        //button
        val button = findViewById<Button>(R.id.button)

        //image
        val image = findViewById<ImageView>(R.id.image)

        //editText
        val editText = findViewById<TextView>(R.id.editText)


    }
}

