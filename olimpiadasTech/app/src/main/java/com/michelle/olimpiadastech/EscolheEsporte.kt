package com.michelle.olimpiadastech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_escolhe_esporte.*

class EscolheEsporte : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolhe_esporte)

        val nomeTime1 = intent.getStringExtra("TIME1")
        val nomeTime2 = intent.getStringExtra("TIME2")

        logoFutebol.setOnClickListener{
            val intent = Intent(this, Futebol::class.java)
            intent.putExtra("TIME1", nomeTime1)
            intent.putExtra("TIME2", nomeTime2)
            startActivity(intent)
        }

        logoVolei.setOnClickListener{
            val intent = Intent(this, Volei::class.java)
            intent.putExtra("TIME1", nomeTime1)
            intent.putExtra("TIME2", nomeTime2)
            startActivity(intent)
        }


    }
}
