package com.example.belajarrecyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.latihanmoviekatalog.DetailMovie
import com.example.latihanmoviekatalog.MovieObj
import com.example.latihanmoviekatalog.R
import com.example.latihanmoviekatalog.databinding.LayoutListBinding


class MovieRecycle : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<MovieObj> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DosenViewHolder {
        val binding =
            LayoutListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DosenViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is DosenViewHolder -> {
                holder.bind(items.get(position))
                holder.klik.setOnClickListener {
                    holder.kalau_diklik(items.get(position))
                }
            }
        }
    }

    fun submitList(listDosen: List<MovieObj>) {
        items = listDosen
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class DosenViewHolder constructor(val binding: LayoutListBinding) : RecyclerView.ViewHolder(binding.root) {
        val poster: ImageView = binding.poster
        val sinopsis: TextView = binding.sinopsisMovie
        val rating: TextView = binding.ratingMovie
        var klik: RelativeLayout = binding.rlKlik

        fun bind(listObjDosen: MovieObj) {
            sinopsis.setText(listObjDosen.sinopsis)
            rating.setText(listObjDosen.rating)

            val requestOp = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOp)
                .load(listObjDosen.poster)
                .into(poster)
        }

        fun kalau_diklik(get: MovieObj) {
            Toast.makeText(itemView.context, "Kamu memilih : ${get.judul}", Toast.LENGTH_SHORT).show()
            val intent = Intent(itemView.context, DetailMovie::class.java)
            intent.putExtra("posternya", get.poster)
            intent.putExtra("ratingnya", get.rating)
            intent.putExtra("judulnya", get.judul)
            intent.putExtra("durasinya", get.durasi)
            intent.putExtra("genrenya", get.genre)
            intent.putExtra("bahasanya", get.bahasa)
            intent.putExtra("pemerannya", get.pemeran)
            intent.putExtra("sinopsisnya", get.sinopsis)
            itemView.context.startActivity(intent)
        }
    }
}