package com.michelle.olimpiadastech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_futebol.*

class Futebol : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futebol)

        pontuacao1.text = "0"
        pontuacao2.text = "0"

        val nomeTime1 = intent.getStringExtra("TIME1")
        val nomeTime2 = intent.getStringExtra("TIME2")

        time1.text = nomeTime1
        time2.text = nomeTime2

        bloco1.setOnClickListener {
            val valorInicial = pontuacao1.text.toString()
            val novoValor = valorInicial.toInt() + 1
            pontuacao1.text = novoValor.toString()
        }

        bloco2.setOnClickListener {
            val valorInicia2 = pontuacao2.text.toString()
            val novoValor = valorInicia2.toInt() + 1
            pontuacao2.text = novoValor.toString()
        }

        zerarBtn.setOnClickListener{
            pontuacao1.text = "0"
            pontuacao2.text = "0"
        }

        menosTime1Btn.setOnClickListener{
            val valorInicial = pontuacao1.text.toString()
            val novoValor = valorInicial.toInt() - 1
            pontuacao1.text = novoValor.toString()

            if (novoValor <= 0)
                pontuacao1.text="0"
        }

        menosTime2Btn.setOnClickListener{
            val valorInicial = pontuacao2.text.toString()
            val novoValor = valorInicial.toInt() - 1
            pontuacao2.text = novoValor.toString()

            if (novoValor <= 0)
                pontuacao2.text="0"
        }
    }
}
