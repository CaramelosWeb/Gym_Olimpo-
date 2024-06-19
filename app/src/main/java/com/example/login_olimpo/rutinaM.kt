package com.example.login_olimpo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class rutinaM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rutina_m)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn: Button = findViewById(R.id.btnregresar)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, genero::class.java)
            startActivity(intent)
        }


        val btnL: Button = findViewById(R.id.btnLunes)
        btnL.setOnClickListener {
                val intent: Intent = Intent(this, LunesM::class.java)
                startActivity(intent)
        }

        val btnM: Button = findViewById(R.id.btnMartes)
        btnM.setOnClickListener {
            val intent: Intent = Intent(this, MartesM::class.java)
            startActivity(intent)
        }

        val btnMi: Button = findViewById(R.id.btnMiercoles)
        btnMi.setOnClickListener {
            val intent: Intent = Intent(this, MiercolesM::class.java)
            startActivity(intent)
        }

        val btnJ: Button = findViewById(R.id.btnJueves)
        btnJ.setOnClickListener {
            val intent: Intent = Intent(this, JuevesM::class.java)
            startActivity(intent)
        }

        val btnV: Button = findViewById(R.id.btnViernes)
        btnV.setOnClickListener {
            val intent: Intent = Intent(this, ViernesM::class.java)
            startActivity(intent)
        }

        val btnS: Button = findViewById(R.id.btnSabado)
        btnS.setOnClickListener {
            val intent: Intent = Intent(this, SabadoM::class.java)
            startActivity(intent)
        }

        val btnD: Button = findViewById(R.id.btnDomingo)
        btnD.setOnClickListener {
            val intent: Intent = Intent(this, DomingoM::class.java)
            startActivity(intent)
        }

    }
}