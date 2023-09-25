package com.example.belajarlayout

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.belajarlayout.databinding.ActivityFrameLayoutBinding

class FrameLayout : AppCompatActivity() {

    private lateinit var binding : ActivityFrameLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrameLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClick(v: View?) {
        binding.btnKlik.visibility = View.GONE
        binding.txtTombol.visibility = View.VISIBLE
    }
}