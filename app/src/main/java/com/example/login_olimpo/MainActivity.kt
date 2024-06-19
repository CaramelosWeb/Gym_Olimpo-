package com.example.login_olimpo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

       val btn: Button = findViewById(R.id.btnRegistrar)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, registro_user:: class.java)
            startActivity(intent)
        }

        val boton: Button = findViewById(R.id.btnIngresa)
        boton.setOnClickListener{
            val intent: Intent = Intent(this, genero:: class.java)
            startActivity(intent)
        }

    }
}