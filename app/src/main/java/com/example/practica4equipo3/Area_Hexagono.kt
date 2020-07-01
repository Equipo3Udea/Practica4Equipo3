package com.example.practica4equipo3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_area__hexagono.*

class Area_Hexagono : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area__hexagono)
//commit

        b_calcular.setOnClickListener {

            val apotema = et_apotema.text.toString()
            val lado = et_lado.text.toString()
            val area: Float

            area = 3 * apotema.toFloat() * lado.toFloat()

            tv_respuesta.text = area.toString()

        }
    }
}