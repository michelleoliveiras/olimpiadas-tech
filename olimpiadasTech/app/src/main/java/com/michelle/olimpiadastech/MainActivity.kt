package com.michelle.olimpiadastech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import com.michelle.olimpiadastech.escolheEsporte as olimpiadastechEscolheEsporte
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    continuarBtn.setOnClickListener{

        if (!nomeTime1.text.isEmpty() && !nomeTime2.text.isEmpty()) {
            val intent = Intent(this, com.michelle.olimpiadastech.escolheEsporte::class.java)
            startActivity(intent)
        }
    }


    }
}
