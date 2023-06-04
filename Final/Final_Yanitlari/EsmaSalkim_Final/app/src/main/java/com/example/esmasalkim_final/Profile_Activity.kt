package com.example.esmasalkim_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

lateinit var txtNameSurname: EditText
lateinit var txtUserProfileMail: EditText
lateinit var btnExit: ImageButton

class Profile_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btnExit=findViewById(R.id.btnExit)

         var mesaj = intent.getStringExtra("mesaj")
        Toast.makeText(this, mesaj.toString(), Toast.LENGTH_SHORT).show()

        btnExit.setOnClickListener {
            navigateToRegister()
        }

    }

    private fun navigateToRegister() {
        // Kayıt ekranına yönlendirme yapılıyor.
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}