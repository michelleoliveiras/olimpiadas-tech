package com.michelle.olimpiadastech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Time


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    continuarBtn.setOnClickListener{

        val nomeTime1 = time1.text.toString()
        val nomeTime2 = time2.text.toString()

        if (!time1.text.isEmpty() && !time2.text.isEmpty()) {
            val intent = Intent(this, EscolheEsporte::class.java)
            intent.putExtra("TIME1", nomeTime1)
            intent.putExtra("TIME2", nomeTime2)
            startActivity(intent)
        }
    }


    }
}
