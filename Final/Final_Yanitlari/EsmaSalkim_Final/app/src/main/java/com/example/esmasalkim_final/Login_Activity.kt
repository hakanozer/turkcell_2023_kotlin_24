package com.example.esmasalkim_final

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

lateinit var txtUserMail: EditText
lateinit var txtUserPassword: EditText
lateinit var btnUserLogin: ImageButton
lateinit var sharedPreferencesLogin: SharedPreferences


class Login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        sharedPreferencesLogin = getSharedPreferences("users", MODE_PRIVATE)

        txtUserMail = findViewById(R.id.txtUserMail)
        txtUserPassword = findViewById(R.id.txtUserPassword)
        btnUserLogin = findViewById(R.id.btnUserLogin)

        btnUserLogin.setOnClickListener {

            val mail = txtEmail.text.toString().trim().replace(" ", "");
            val password = txtPassword.text.toString().trim();

            if (mail == "") {
                Toast.makeText(this, "E-mail Girilmesi Zorunludur!", Toast.LENGTH_SHORT).show()
            }else if ( password == "" ) {
                Toast.makeText(this, "Password Girilmesi Zorunludur!", Toast.LENGTH_SHORT).show()
            }else if ( !isValidEmail(mail) ) {
                Toast.makeText(this, "Email Formatı Yanlıştır!", Toast.LENGTH_SHORT).show()
            }
            else{
                //Bütün kontrolleri geçtiyse profile sayfasına yönlendirilecek
                val name = sharedPreferencesLogin.getString("name","")
                val surname = sharedPreferencesLogin.getString("surname","")
                navigateToProfile(name.toString(), surname.toString(), mail)

            }

        }

    }
    fun isValidEmail(email: String): Boolean {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

     fun navigateToProfile(name: String, surname: String, email: String) {
        // Profil ekranına yönlendirme işlemini yapıyoruz
        // Kod okunabilirliği açısından parçalayarak mesajı birleştirdim.
        val welcomeMessage = "Hoş Geldiniz"
        val nameSurname = "Sn. $name $surname"
        val eMailMessage = "$email"
        val message = welcomeMessage + "\n" + nameSurname + "\n" + eMailMessage

        val intent = Intent(this, Profile_Activity::class.java)
        intent.putExtra("mesaj",message)
        startActivity(intent)

    }
}