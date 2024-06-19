package com.example.login_olimpo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class genero : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_genero)

        val btn: ImageButton  = findViewById(R.id.btnIMujer)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, rutinaM:: class.java)
            startActivity(intent)

        }

        val boton: ImageButton  = findViewById(R.id.btnIHombre)
        boton.setOnClickListener{
            val intent: Intent = Intent(this, rutinaH:: class.java)
            startActivity(intent)

        }

        val buton: Button  = findViewById(R.id.btnCerrar)
        buton.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)

        }
    }
}