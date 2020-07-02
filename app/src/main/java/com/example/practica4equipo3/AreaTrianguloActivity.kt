package com.example.practica4equipo3

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_area_triangulo.*

class AreaTrianguloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_triangulo)
        bt_calcular.setOnClickListener {
            val base = et_triangulo_base.text.toString()
            val altura = et_triangulo_altura.text.toString()
            val op_base = base.toDouble()
            val op_altura = altura.toDouble()
            val area: Double

            if (base.isEmpty()) {
                Toast.makeText(this, "Ingrese la base", Toast.LENGTH_SHORT).show()
            } else {
                if (altura.isEmpty()) {
                    Toast.makeText(this, "Ingrese la altura", Toast.LENGTH_SHORT).show()
                } else {
                    area = op_altura * op_base / 2
                    tv_triangulo_mostrar.text = "El área del triángulo es: $area cm^2"
                }
            }
        }
    }
}