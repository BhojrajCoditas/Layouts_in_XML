package com.example.navigationimplementation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ConstraintLayoutActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)

        // Initialize your views and set up any listeners here
        val username = findViewById<EditText>(R.id.username1)
        val password = findViewById<EditText>(R.id.editTextTextPasswords)
        val login = findViewById<Button>(R.id.button)
        val loginImage = findViewById<ImageView>(R.id.imageView2)

    }
}