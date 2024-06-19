package com.example.login_olimpo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class JuevesM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_jueves_m)

        val buton: Button = findViewById(R.id.MJueves)
        buton.setOnClickListener{
            val intent: Intent = Intent(this, rutinaM:: class.java)
            startActivity(intent)
        }
    }
}