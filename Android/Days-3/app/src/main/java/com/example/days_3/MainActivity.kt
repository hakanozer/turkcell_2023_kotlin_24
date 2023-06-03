package com.example.days_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var txtEmail: EditText
    lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shared = getSharedPreferences("users", MODE_PRIVATE)
        val editor = shared.edit()

        // Email data control
        val email = shared.getString("email", "")
        if ( email.equals("ali@mail.com")) {
            val i = Intent(this@MainActivity, Profile::class.java )
            startActivity(i)
        }

        txtEmail = findViewById(R.id.txtEmail)
        btnSave = findViewById(R.id.btnSave)
        btnSave.setOnClickListener {
            val email = txtEmail.text.toString()
            editor.putString("email", email)
            editor.commit()
            Toast.makeText(this@MainActivity, "Kayıt Başarılı Oldu", Toast.LENGTH_LONG).show()
        }


    }
}