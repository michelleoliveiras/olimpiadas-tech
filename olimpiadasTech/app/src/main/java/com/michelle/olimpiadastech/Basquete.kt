package com.michelle.olimpiadastech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_basquete.*

class Basquete : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basquete)

        pontuacao1.text="0"
        pontuacao2.text="0"

        val nomeTime1 = intent.getStringExtra("TIME1")
        val nomeTime2 = intent.getStringExtra("TIME2")

        var ultimaAlteracao1  = 0
        var ultimaAlteracao2 = 0

        time1.text = nomeTime1
        time2.text = nomeTime2

        zerarBtn.setOnClickListener{
            pontuacao1.text = "0"
            pontuacao2.text = "0"
        }

        mais1Btn1.setOnClickListener{
            val valorInicial = pontuacao1.text.toString()
            val novoValor = valorInicial.toInt() + 1
            pontuacao1.text = novoValor.toString()

            ultimaAlteracao1 =  1
        }

        mais1Btn2.setOnClickListener{
            val valorInicial = pontuacao2.text.toString()
            val novoValor = valorInicial.toInt() + 1
            pontuacao2.text = novoValor.toString()

            ultimaAlteracao2 =  1
        }

        mais2Btn1.setOnClickListener{
            val valorInicial = pontuacao1.text.toString()
            val novoValor = valorInicial.toInt() + 2
            pontuacao1.text = novoValor.toString()

            ultimaAlteracao1 =  2
        }

        mais2Btn2.setOnClickListener{
            val valorInicial = pontuacao2.text.toString()
            val novoValor = valorInicial.toInt() + 2
            pontuacao2.text = novoValor.toString()

            ultimaAlteracao2 =  2
        }

        mais3Btn1.setOnClickListener{
            val valorInicial = pontuacao1.text.toString()
            val novoValor = valorInicial.toInt() + 3
            pontuacao1.text = novoValor.toString()

            ultimaAlteracao1 =  3
        }

        mais3Btn2.setOnClickListener{
            val valorInicial = pontuacao2.text.toString()
            val novoValor = valorInicial.toInt() + 3
            pontuacao2.text = novoValor.toString()

            ultimaAlteracao2 =  3
        }

        desfazerTime1Btn.setOnClickListener{
            val valorInicial = pontuacao1.text.toString()
            val novoValor = valorInicial.toInt() - ultimaAlteracao1
            pontuacao1.text = novoValor.toString()

            if (novoValor <= 0)
                pontuacao1.text = "0"
        }

        desfazerTime2Btn.setOnClickListener{
            val valorInicial = pontuacao2.text.toString()
            val novoValor = valorInicial.toInt() - ultimaAlteracao2
            pontuacao2.text = novoValor.toString()

            if (novoValor <= 0)
                pontuacao2.text = "0"
        }

    }
}
