package com.example.days_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var txtData: EditText
    lateinit var btnProfile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtData = findViewById(R.id.txtData)
        btnProfile = findViewById(R.id.btnProfile)

        // Onlick
        btnProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            // data push
            val txt = txtData.text.toString()
            intent.putExtra("key1", txt )
            startActivity(intent)
            // finish() // bu sınıfı öldür.
        }

    }
}