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

            val intent: Intent =
                Intent(this, /*poner aquí la actividad correspondiente*/::class.java)
            startActivity(intent)
        }

        b_PerimetroCirculo.setOnClickListener {
            val intent: Intent =
                Intent(this, /*poner aquí la actividad correspondiente*/::class.java)
            startActivity(intent)
        }
        b_AreaCirculo.setOnClickListener {
            val intent: Intent =
                Intent(this, /*poner aquí la actividad correspondiente*/::class.java)
            startActivity(intent)
        }
        b_AreaHexagono.setOnClickListener {
            val intent: Intent = Intent(this, Area_Hexagono::class.java)
            startActivity(intent)
        }
        b_AreaTriangulo.setOnClickListener {

            val intent: Intent =
                Intent(this, /*poner aquí la actividad correspondiente*/::class.java)
            startActivity(intent)
        }

        b_AreaCuadrado.setOnClickListener {
            val intent: Intent =
                Intent(this, /*poner aquí la actividad correspondiente*/::class.java)
            startActivity(intent)
        }


    }
}

//Primer commit de prueba