package com.example.esmasalkim_final

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.ImageButton
import android.widget.EditText
import android.widget.Toast

lateinit var txtName:EditText
lateinit var txtSurname:EditText
lateinit var txtEmail:EditText
lateinit var txtPassword:EditText
lateinit var btnRegister:ImageButton
lateinit var sharedPreferences: SharedPreferences

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = getSharedPreferences("users", MODE_PRIVATE)

        txtName=findViewById(R.id.txtName)
        txtSurname = findViewById(R.id.txtSurname)
        txtEmail = findViewById(R.id.txtEmail)
        txtPassword = findViewById(R.id.txtPassword)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val name = txtName.text.toString().trim().replace(" ", "");
            val surname = txtSurname.text.toString().trim().replace(" ", "");
            val mail = txtEmail.text.toString().trim().replace(" ", "");
            val password = txtPassword.text.toString().trim();



             if ( name == "" ) {
                 Toast.makeText(this, "Ad Girilmesi Zorunludur!", Toast.LENGTH_SHORT).show()
             } else if ( surname == "" ) {
                Toast.makeText(this, "Soyad Girilmesi Zorunludur!", Toast.LENGTH_SHORT).show()
            } else if (mail == "") {
                Toast.makeText(this, "E-mail Girilmesi Zorunludur!", Toast.LENGTH_SHORT).show()
            }else if ( password == "" ) {
                Toast.makeText(this, "Password Girilmesi Zorunludur!", Toast.LENGTH_SHORT).show()
            }else if ( !isValidEmail(mail) ) {
                Toast.makeText(this, "Email Formatı Yanlıştır!", Toast.LENGTH_SHORT).show()
            }
            else{
                //Bütün kontrolleri geçip kaydetme işlemini yapacağız.
                 saveUserInformation(name, surname, mail, password)
                 goLoginActivity()

            }

        }

    }

    fun isValidEmail(email: String): Boolean {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun saveUserInformation(name: String, surname: String, email: String, password: String) {
        val editor = sharedPreferences.edit()
        editor.putString("name", name)
        editor.putString("surname", surname)
        editor.putString("email", email)
        editor.putString("password", password)
        editor.commit()
    }

    private fun goLoginActivity() {
        // Giriş ekranına yönlendirme kısmı
        val intent = Intent(this, Login_Activity::class.java)
        startActivity(intent)
    }

}