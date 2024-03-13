package com.example.my_app

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.os.Bundle

class DashboadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val closeBtn = findViewById<Button>(R.id.closeButton)

        closeBtn.setOnClickListener {
            finish()
        }
    }
}