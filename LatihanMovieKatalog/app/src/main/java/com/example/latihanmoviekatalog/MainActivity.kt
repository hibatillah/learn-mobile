package com.example.latihanmoviekatalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.belajarrecyclerview.MovieRecycle
import com.example.latihanmoviekatalog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var MovieAdapter: MovieRecycle
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        tambahDataSet()
    }

    private fun tambahDataSet() {
        val data = DataMovie.setData()
        MovieAdapter.submitList(data)
    }

    private fun initRecyclerView() {
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val spacingAtas = DekorasiPoster(20)
            addItemDecoration(spacingAtas)
            MovieAdapter = MovieRecycle()
            adapter = MovieAdapter
        }
    }
}