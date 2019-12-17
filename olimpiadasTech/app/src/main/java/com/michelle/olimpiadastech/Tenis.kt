package com.michelle.olimpiadastech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tenis.*

class Tenis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tenis)

        pontuacao1.text = "0"
        pontuacao2.text = "0"

        val nomeTime1 = intent.getStringExtra("TIME1")
        val nomeTime2 = intent.getStringExtra("TIME2")

        time1.text = nomeTime1
        time2.text = nomeTime2

        var set1 = 0
        var set2 = 0

        bloco1.setOnClickListener{
            val pontuacaoInicial1 = pontuacao1.text.toString().toInt()
            val pontuacaoInicial2 = pontuacao2.text.toString().toInt()
            val novoValor = pontuacaoInicial1 + 1
            pontuacao1.text = novoValor.toString()

            if (novoValor >= 11 && novoValor >= pontuacaoInicial2 + 2 && set1 < 7) {
                set1++
                placarSet1.text = set1.toString()
                pontuacao1.text = "0"
                pontuacao2.text = "0"
            }

            if (set1 == 7) {
                pontuacao1.text = "0"
                pontuacao2.text = "0"
                placarSet1.text = "0"
                placarSet2.text = "0"
                Toast.makeText(this,"Fim de jogo! $nomeTime1 venceu",Toast.LENGTH_LONG).show()
                set1=0
                set2=0
            }
        }

        bloco2.setOnClickListener{
            val pontuacaoInicial2 = pontuacao2.text.toString().toInt()
            val pontuacaoInicial1 = pontuacao1.text.toString().toInt()
            val novoValor = pontuacaoInicial2 + 1
            pontuacao2.text = novoValor.toString()

            if (novoValor >= 11 && novoValor >= pontuacaoInicial1 + 2 && set2 < 7) {
                set2++
                placarSet2.text = set2.toString()
                pontuacao1.text = "0"
                pontuacao2.text = "0"
            }

            if (set2 == 7) {
                pontuacao1.text = "0"
                pontuacao2.text = "0"
                placarSet1.text = "0"
                placarSet2.text = "0"
                Toast.makeText(this,"Fim de jogo! $nomeTime2 venceu",Toast.LENGTH_LONG).show()
                set1=0
                set2=0
            }
        }

        menosTime1Btn.setOnClickListener{
            val pontuacaoInicial1 = pontuacao1.text.toString().toInt()
            val novoValor = pontuacaoInicial1 - 1
            pontuacao1.text = novoValor.toString()
        }

        menosTime2Btn.setOnClickListener{
            val pontuacaoInicial2 = pontuacao2.text.toString().toInt()
            val novoValor = pontuacaoInicial2 - 1
            pontuacao2.text = novoValor.toString()
        }

        zerarBtn.setOnClickListener{
            pontuacao1.text = "0"
            pontuacao2.text = "0"
        }

    }
}
