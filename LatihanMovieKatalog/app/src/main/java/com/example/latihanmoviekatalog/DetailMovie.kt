package com.example.latihanmoviekatalog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.latihanmoviekatalog.databinding.DetailMovieBinding

class DetailMovie : AppCompatActivity() {
    private lateinit var binding: DetailMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetailMovieBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if (intent.hasExtra("posternya")) {
            val poster: String = this.intent.getStringExtra("posternya").toString()
            val rating: String = this.intent.getStringExtra("ratingnya").toString()
            val judul: String = this.intent.getStringExtra("judulnya").toString()
            val durasi: String = this.intent.getStringExtra("durasinya").toString()
            val genre: String = this.intent.getStringExtra("genrenya").toString()
            val bahasa: String = this.intent.getStringExtra("bahasanya").toString()
            val pemeran: String = this.intent.getStringExtra("pemerannya").toString()
            val sinopsis: String = this.intent.getStringExtra("sinopsisnya").toString()

            setDetil(poster, judul, rating, durasi, genre, bahasa, pemeran, sinopsis)
        }
    }

    fun setDetil(poster: String, judul: String, rating: String, durasi: String, genre: String, bahasa: String, pemeran: String, sinopsis: String) {
        val requestOp = RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)

        binding.ratingMovie.text = rating
        binding.judulMovie.text = judul
        binding.durasiMovie.text = durasi
        binding.genreMovie.text = genre
        binding.bahasaMovie.text = bahasa
        binding.pemeranMovie.text = pemeran
        binding.sinopsisMovie.text = sinopsis

        Glide.with(this)
            .load(poster)
            .apply(requestOp)
            .centerCrop()
            .into(binding.poster)
    }
}