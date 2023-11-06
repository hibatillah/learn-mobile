package com.ujian.soaluts.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ujian.soaluts.R
import com.ujian.soaluts.databinding.FragmentHalamanKalkulatorBinding

class HalamanKalkulator : Fragment() {
    private lateinit var binding: FragmentHalamanKalkulatorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_halaman_kalkulator, container, false)
        binding = FragmentHalamanKalkulatorBinding.bind(view)

        binding.btnKalkulator.setOnClickListener {
            val berat = Integer.valueOf(binding.editBerat.getText().toString())
            val tinggi = Integer.valueOf(binding.editTinggi.getText().toString())
            val bmi = berat / (tinggi * tinggi)
            var status = ""

            if (bmi < 18.5) {
                status = "Kekurangan berat badan"
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal (Ideal)"
            } else if (bmi >= 25 && bmi <= 29.9) {
                status = "Kelebihan berat badan"
            } else {
                status = "Kegemukan"
            }
            binding.textResult.setText(status)
        }
        return view
    }


}