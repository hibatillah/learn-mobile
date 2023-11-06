package com.ujian.soaluts.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ujian.soaluts.R
import android.content.Intent
import com.ujian.soaluts.databinding.HalamanUtamaBinding

class HalamanUtama : Fragment() {
    private lateinit var binding: HalamanUtamaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.halaman_utama, container, false)
    }
}