package com.michelle.olimpiadastech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_volei.*

class Volei : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volei)

        val nomeTime1 = intent.getStringExtra("TIME1")
        val nomeTime2 = intent.getStringExtra("TIME2")

        pontuacao1.text = "0"
        pontuacao2.text = "0"

        time1.text = nomeTime1
        time2.text = nomeTime2

        bloco1.setOnClickListener{
            val valorInicial = pontuacao1.text.toString()
            val novoValor = valorInicial.toInt() + 1
            pontuacao1.text = novoValor.toString()
        }

        if (pontuacao1.text.toString().toInt() >= 25 && pontuacao1.text.toString().toInt() >= pontuacao2.text.toString().toInt() + 2) {
            Toast.makeText(this,"Fim de jogo!",Toast.LENGTH_LONG).show()
            pontuacao1.text="0"
            pontuacao2.text="0"
        }

        bloco2.setOnClickListener{
            val valorInicial2 = pontuacao2.text.toString()
            val novoValor2 = valorInicial2.toInt() + 1
            pontuacao2.text = novoValor2.toString()
        }

        if (pontuacao2.text.toString().toInt() >= 25 && pontuacao2.text.toString().toInt() >= pontuacao1.text.toString().toInt() + 2){
            Toast.makeText(this,"Fim de jogo!",Toast.LENGTH_LONG).show()
            pontuacao1.text="0"
            pontuacao2.text="0"
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
                pontuacao1.text = "0"
        }

        menosTime2Btn.setOnClickListener{
            val valorInicial2 = pontuacao1.text.toString()
            val novoValor = valorInicial2.toInt() - 1
            pontuacao2.text = novoValor.toString()

            if (novoValor <=0)
                pontuacao2.text = "0"
        }

    }
}
