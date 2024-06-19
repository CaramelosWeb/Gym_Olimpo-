package com.example.login_olimpo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MartesH : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_martes_h)

        val btn: Button = findViewById(R.id.btnHMAregreso)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, rutinaH::class.java)
            startActivity(intent)
        }
    }
}