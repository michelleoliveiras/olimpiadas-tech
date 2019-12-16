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

        var set1 = 0
        var set2 = 0

        pontuacao1.text = "0"
        pontuacao2.text = "0"

        time1.text = nomeTime1
        time2.text = nomeTime2

        bloco1.setOnClickListener{
            val pontuacaoInicial1 = pontuacao1.text.toString().toInt()
            val pontuacaoInicial2 = pontuacao2.text.toString().toInt()
            val novoValor = pontuacaoInicial1 + 1
            pontuacao1.text = novoValor.toString()

            if (pontuacaoInicial1 >= 21 && pontuacaoInicial1 >= pontuacaoInicial2 + 2) {
                Toast.makeText(this,"Fim de set! $nomeTime1 venceu",Toast.LENGTH_LONG).show()
                pontuacao1.text="0"
                pontuacao2.text="0"
                set1++
                placarSet1.text = set1.toString()
            }

            if (set1 == 2 && set2 <=1)
                Toast.makeText(this,"Fim de jogo! $nomeTime1 venceu a partida",Toast.LENGTH_LONG).show()

            if (set1 == 1 && set2 == 1)
                if (pontuacaoInicial1 >= 15 && pontuacaoInicial1 >= pontuacaoInicial2 + 2){
                    Toast.makeText(this,"Fim de jogo! $nomeTime1 venceu a partida",Toast.LENGTH_LONG).show()
                    pontuacao1.text = "0"
                    pontuacao2.text = "0"
                    set1=0
                    set2=0
                }
        }

        bloco2.setOnClickListener{
            val pontuacaoInicial1 = pontuacao1.text.toString().toInt()
            val pontuacaoInicial2 = pontuacao2.text.toString().toInt()
            val novoValor2 = pontuacaoInicial2 + 1
            pontuacao2.text = novoValor2.toString()

            if (pontuacaoInicial2 >= 21 && pontuacaoInicial2 >= pontuacaoInicial1 + 2) {
                Toast.makeText(this,"Fim de set! $nomeTime2 venceu",Toast.LENGTH_LONG).show()
                pontuacao1.text="0"
                pontuacao2.text="0"
                set2++
                placarSet2.text = set2.toString()
            }

            if (set2 == 2 && set1 <=1)
                Toast.makeText(this,"Fim de jogo! $nomeTime2 venceu a partida",Toast.LENGTH_LONG).show()

            if (set1 == 1 && set2 == 1)
                if (pontuacaoInicial2 >= 15 && pontuacaoInicial2 >= pontuacaoInicial1 + 2){
                    Toast.makeText(this,"Fim de jogo! $nomeTime2 venceu a partida",Toast.LENGTH_LONG).show()
                    pontuacao1.text = "0"
                    pontuacao2.text = "0"
                    set1=0
                    set2=0
                }
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
            val valorInicial2 = pontuacao2.text.toString()
            val novoValor = valorInicial2.toInt() - 1
            pontuacao2.text = novoValor.toString()

            if (novoValor <=0)
                pontuacao2.text = "0"
        }

    }
}
