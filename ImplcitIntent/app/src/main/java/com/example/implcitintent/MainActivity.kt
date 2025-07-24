package com.example.implcitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var button: Button // Use lateinit
   lateinit var editText: EditText // Use lateinit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        editText = findViewById(R.id.editText)

        button.setOnClickListener { // No need for !!
            val url = editText.text.toString() // No need for !!
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent) // Correct way to start activity from an Activity
        }
    }
}