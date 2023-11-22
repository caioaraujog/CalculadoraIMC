package com.example.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult = findViewById<TextView>(R.id.textview_result)

        val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)

        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        tvResult.text = result.toString()

        var classificação = ""
        if (result < 18.5f) {
            classificação = ("ABAIXO DO PESO")
        } else if (result >= 18.5f && result <= 24.9f) {
            classificação = ("NORMAL")
        } else if (result >= 25.0f && result <= 29.9f) {
            classificação = ("SOBREPESO")
        } else if (result >= 30.0f && result <= 39.9f) {
            classificação = ("OBESIDADE")
        } else {
            classificação = ("OBESIDADE GRAVE")
        }
        tvClassificacao.text = getString(R.string.message_classificacao, classificação)

    }
}