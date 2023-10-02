package com.example.belajarkalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarkalkulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHapus.setOnClickListener {
            binding.edtPanjang.setText("")
            binding.edtLebar.setText("")
            binding.edtTinggi.setText("")
        }
        binding.btnHitung.setOnClickListener {
            val panjang = Integer.valueOf(binding.edtPanjang.getText().toString())
            val lebar = Integer.valueOf(binding.edtLebar.getText().toString())
            val tinggi = Integer.valueOf(binding.edtTinggi.getText().toString())
            val luas = 2 * (panjang * lebar * tinggi)
            val keliling = 4 * (panjang * lebar * tinggi)
            val volume = panjang * lebar * tinggi
            val teksOutput = "Hasil Perhitungan " +
                    "\n\nLuas = $luas cm" +
                    "\nKeliling = $keliling cm" +
                    "\nVolume = $volume cm"
            binding.txHasil.setText(teksOutput)
            binding.txHasil.setTextColor(getColor(R.color.colorAccent))
        }
    }
}