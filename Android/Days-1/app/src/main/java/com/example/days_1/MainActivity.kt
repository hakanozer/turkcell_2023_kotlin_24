package com.example.days_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.util.Patterns
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var txtLoginEmail:EditText
    lateinit var txtLoginPassword: EditText
    lateinit var chkLoginRemember: CheckBox
    lateinit var btnLoginLogin: Button
    lateinit var btnLoginRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtLoginEmail = findViewById(R.id.txtLoginEmail)
        txtLoginPassword = findViewById(R.id.txtLoginPassword)
        chkLoginRemember = findViewById(R.id.chkLoginRemember)
        btnLoginLogin = findViewById(R.id.btnLoginLogin)
        btnLoginRegister = findViewById(R.id.btnLoginRegister)

        // Button Click Listener
        btnLoginLogin.setOnClickListener {
            val email = txtLoginEmail.text.toString().trim().replace(" ", "")
            val password = txtLoginPassword.text.toString().trim()
            val rememberStatus = chkLoginRemember.isChecked
            Log.d("rememberStatus",  rememberStatus.toString())

            if (email == "") {
                Toast.makeText(this, "E-mail Empty!", Toast.LENGTH_SHORT).show()
            }else if ( password == "" ) {
                Toast.makeText(this, "Password Empty!", Toast.LENGTH_SHORT).show()
             }else if ( !isValidEmail(email) ) {
                Toast.makeText(this, "Email Format Fail!", Toast.LENGTH_SHORT).show()
            }
            else {
                // Tüm datalar kontrol edildi, sunucuya gönder.
                Log.d("email", email)
            }

        }

    }


    fun isValidEmail(email: String): Boolean {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

}

