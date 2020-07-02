package com.example.practica4equipo3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b_PerimetroHexagono.setOnClickListener {

            val intent: Intent = Intent(this, ActivityPerimetroHexagono::class.java)
            startActivity(intent)
        }

        b_PerimetroCuadrado.setOnClickListener {
            val intent: Intent = Intent(this, PerimetroCuadro::class.java)
            startActivity(intent)
        }

        b_AreaCirculo.setOnClickListener {
            val intent: Intent = Intent(this, AreaCirculoActivity::class.java)
            startActivity(intent)
        }

        b_AreaHexagono.setOnClickListener {
            val intent: Intent = Intent(this, Area_Hexagono::class.java)
            startActivity(intent)
        }

        b_AreaTriangulo.setOnClickListener {
            val intent: Intent = Intent(this, AreaTrianguloActivity::class.java)
            startActivity(intent)
        }

        b_PerimetroTriangulo.setOnClickListener {
            val intent: Intent = Intent(this, PertrianguloActivity::class.java)
            startActivity(intent)
        }


    }
}