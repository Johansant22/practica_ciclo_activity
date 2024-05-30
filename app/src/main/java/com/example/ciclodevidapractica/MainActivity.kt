package com.example.ciclodevidapractica

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onstar", Toast.LENGTH_SHORT).show()

        // Se utiliza cuando la Activity se vuelve visible para el usuario
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onresume", Toast.LENGTH_SHORT).show()
        // Se utiliza cuando la Activity se encuentra en primer plano y es interactiva
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onpause", Toast.LENGTH_SHORT).show()
        // Se utiliza cuando la Activity pierde el foco pero todavía es visible para el usuario
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onstop", Toast.LENGTH_SHORT).show()
        // Se llama cuando la Activity ya no es visible para el usuario
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "ondestroy", Toast.LENGTH_SHORT).show()
        // Se llama antes de que la Activity sea destruida
    }
}