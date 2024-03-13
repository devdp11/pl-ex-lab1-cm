package com.example.my_app

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.os.Bundle

class LoginActivity : AppCompatActivity() {
    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate (savedInstanceState)
        setContentView (R.layout.activity_login)

        val SignInBtn = findViewById<Button>(R.id.signInButton)

        SignInBtn.setOnClickListener {
            val redirect = Intent (this, DashboadActivity :: class.java)
            startActivity(redirect)
        }

    }
}
