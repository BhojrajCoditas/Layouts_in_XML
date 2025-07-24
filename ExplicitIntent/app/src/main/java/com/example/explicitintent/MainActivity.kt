package com.example.explicitintent

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class VariousExplicitIntentExamples : AppCompatActivity() {

    // Constants
    val CALL_REQUEST_CODE = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpPermissions()
        initViews()
    }

    // Initialize views and set click listeners
    private fun initViews() {
        val callButton = findViewById<Button>(R.id.button_call)
        val callLogButton = findViewById<Button>(R.id.button_call_log)
        val contactsButton = findViewById<Button>(R.id.button_contacts)
        val galleryButton = findViewById<Button>(R.id.button_gallery)
        val browserButton = findViewById<Button>(R.id.button_browser)
        val cameraButton = findViewById<Button>(R.id.button_camera)
        val alarmButton = findViewById<Button>(R.id.button_alarm)

        callButton.setOnClickListener { callButton() }
        callLogButton.setOnClickListener { callLogButton() }
        contactsButton.setOnClickListener { contactsButton() }
        galleryButton.setOnClickListener { galleryButton() }
        browserButton.setOnClickListener { browserButton() }
        cameraButton.setOnClickListener { cameraButton() }
        alarmButton.setOnClickListener { alarmButton() }
    }

    // Open dialer to make a call
    private fun callButton() {
        val intent = Intent(Intent.ACTION_CALL)
        intent.data = Uri.parse("+91 9599652867")
        startActivity(intent)
    }

    // Open call log
    private fun callLogButton() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.type = CallLog.Calls.CONTENT_TYPE
        startActivity(intent)
    }

    // Open contacts
    private fun contactsButton() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = ContactsContract.Contacts.CONTENT_TYPE
        startActivity(intent)
    }

    // Open gallery
    private fun galleryButton() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("content://media/external/images/media/")
        startActivity(intent)
    }

    // Open browser
    private fun browserButton() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("http://www.google.com")
        startActivity(intent)
    }

    // Open camera
    private fun cameraButton() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(intent)
    }

    // Open alarm
    private fun alarmButton() {
        val intent = Intent(AlarmClock.ACTION_SHOW_ALARMS)
        startActivity(intent)
    }

    // Check and request permissions for CALL_PHONE
    private fun setUpPermissions() {
        val permission =
            ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE)

        if (permission != PackageManager.PERMISSION_GRANTED) {
            makeRequest()
        }
    }

    // Request permissions for CALL_PHONE
    private fun makeRequest() {
        ActivityCompat.requestPermissions(
            this, arrayOf(android.Manifest.permission.CALL_PHONE),
            CALL_REQUEST_CODE
        )
    }
}