package com.example.belajarintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun PanggilActivityKedua(view: View?) {
        val i = Intent(applicationContext, MainActivity2::class.java)
        i.putExtra("Value1", "Belajar Andorid")
        i.putExtra("Value2", "Pemrograman Mobile")
        startActivity(i)
    }
}