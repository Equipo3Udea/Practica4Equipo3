package com.example.practica4equipo3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_perimetro_hexagono.*

class ActivityPerimetroHexagono : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perimetro_hexagono)

        BT_calcular.setOnClickListener {
            val lado = ET_lado.text.toString().toDouble()
            val peri = lado * 6.0
            TV_resultado.text = "El valor del perímetro del héxagono es de: $peri"
        }
    }
}