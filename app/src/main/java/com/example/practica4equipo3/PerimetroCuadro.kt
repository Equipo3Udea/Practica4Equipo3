package com.example.practica4equipo3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_perimetro_cuadro.*

class PerimetroCuadro : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perimetro_cuadro)

        this.bt_calcularpc.setOnClickListener {
            val ladoCuadrado = et_ladocuadrado.text.toString().toDouble()
            val perimetroCuadrado = ladoCuadrado * 4.0
            tv_resultadopc.text = "Perímetro del cuadrado: $perimetroCuadrado"
        }
    }
}