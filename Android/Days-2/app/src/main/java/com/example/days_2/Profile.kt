package com.example.days_2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class Profile : AppCompatActivity() {

    var pullData = ""
    lateinit var btnShowAlert: Button
    lateinit var btnExit: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btnShowAlert = findViewById(R.id.btnShowAlert)
        btnExit = findViewById(R.id.btnExit)

        val data1 = intent.getStringExtra("key1")
        if ( data1 != null ) {
            this.pullData = data1
        }

        btnShowAlert.setOnClickListener {
            Snackbar.make(it, this.pullData, Snackbar.ANIMATION_MODE_SLIDE ).show()
        }

        btnExit.setOnClickListener {
            finish()
        }
    }




}