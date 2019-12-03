package com.michelle.olimpiadastech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_escolhe_esporte.*

class escolheEsporte : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolhe_esporte)

        logoFutebol.setOnClickListener{
            val intent = Intent(this, futebol::class.java)
            startActivity(intent)
        }



    }
}
