package com.example.minhastarefas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botao: Button = findViewById(R.id.btnoutratela)
        botao.setOnClickListener {
            val novaTela = Intent(this, Tela2::class.java)
            startActivity(novaTela)
        }
    }

}