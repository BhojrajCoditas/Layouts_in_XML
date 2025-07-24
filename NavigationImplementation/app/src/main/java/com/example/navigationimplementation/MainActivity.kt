package com.example.navigationimplementation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnLinearLayout).setOnClickListener {
            startActivity(Intent(this, LinearLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btnRelativeLayout).setOnClickListener {
            startActivity(Intent(this, RelativeLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btnConstraintLayout).setOnClickListener {
            startActivity(Intent(this, ConstraintLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btnWebView).setOnClickListener {
            startActivity(Intent(this, WebViewActivity::class.java))
        }
    }
}
