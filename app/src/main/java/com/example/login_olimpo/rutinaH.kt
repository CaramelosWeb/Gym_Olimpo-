package com.example.login_olimpo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class rutinaH : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rutina_h)

        val btn: Button = findViewById(R.id.btnregresar)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, genero::class.java)
            startActivity(intent)
        }

        val btnl: Button = findViewById(R.id.btnlunes)
        btnl.setOnClickListener {
            val intent: Intent = Intent(this, LunesH::class.java)
            startActivity(intent)
        }

        val btnm: Button = findViewById(R.id.btnmartes)
        btnm.setOnClickListener {
            val intent: Intent = Intent(this, MartesH::class.java)
            startActivity(intent)
        }

        val btnmi: Button = findViewById(R.id.btnmiercoles)
        btnmi.setOnClickListener {
            val intent: Intent = Intent(this, MiercolesH::class.java)
            startActivity(intent)
        }

        val btnj: Button = findViewById(R.id.btnjueves)
        btnj.setOnClickListener {
            val intent: Intent = Intent(this, JuevesH::class.java)
            startActivity(intent)
        }

        val btnv: Button = findViewById(R.id.btnviernes)
        btnv.setOnClickListener {
            val intent: Intent = Intent(this, ViernesH::class.java)
            startActivity(intent)
        }

        val btns: Button = findViewById(R.id.btnsabado)
        btns.setOnClickListener {
            val intent: Intent = Intent(this, SabadoH::class.java)
            startActivity(intent)
        }

        val btnd: Button = findViewById(R.id.btndomingo)
        btnd.setOnClickListener {
            val intent: Intent = Intent(this, DomingoH::class.java)
            startActivity(intent)
        }

    }
}