package com.example.days_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class Profile : AppCompatActivity() {

    lateinit var txtEmailView: TextView
    lateinit var btnExit: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        txtEmailView = findViewById(R.id.txtEmailView)
        btnExit = findViewById(R.id.btnExit)

        val shared = getSharedPreferences("users", MODE_PRIVATE)
        val email = shared.getString("email", "")
        Toast.makeText(this, email, Toast.LENGTH_LONG).show()
        txtEmailView.setText(email)

        btnExit.setOnClickListener {
            val edit = shared.edit()
            edit.remove("email")
            edit.commit()
            finish()
        }

    }
}