package com.example.login_olimpo

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class registro_user : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro_user)

        val btn: Button = findViewById(R.id.btnRegresa)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        alertn(this)
    }

    fun alertn(context: Activity){
        val boton: Button = findViewById(R.id.btnRegistro)
        boton.setOnClickListener{
            val builder = AlertDialog.Builder(context)

            builder.setTitle("Gym OLIMPO")
            builder.setMessage("Registro Completado, Gracias")
                .setPositiveButton("Aceptar", DialogInterface.OnClickListener{dialog, id -> })
            builder.show()
        }
    }
}