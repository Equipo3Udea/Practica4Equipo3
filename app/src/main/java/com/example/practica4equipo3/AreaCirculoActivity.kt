package com.example.practica4equipo3

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_area_circulo.*

class AreaCirculoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_circulo)


        bt_calcular.setOnClickListener {

            val radio = et_radio.text.toString()

            val pi = 3.1415

            if (radio.isNotEmpty()) {

                val valorResultado = String.format("%.2f", radio.toDouble() * radio.toDouble() * pi)
                tv_resultado.text = "$valorResultado cm²"


            } else {
                Toast.makeText(
                    applicationContext,
                    "Escribe el radio del círculo",
                    Toast.LENGTH_LONG
                ).show()
            }


        }
    }
}