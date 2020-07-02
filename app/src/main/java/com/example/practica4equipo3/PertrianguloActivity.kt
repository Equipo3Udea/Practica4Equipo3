package com.example.practica4equipo3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pertriangulo.*

class PertrianguloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertriangulo)
        var lado = 0
        var str = "0"

        bt_calc.setOnClickListener {
            lado = Integer.parseInt(et_lado.text.toString())
            lado = lado * 3
            str = lado.toString()
            tv_res.text = "Perímetro: $lado cm"

        }
        bt_volver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}