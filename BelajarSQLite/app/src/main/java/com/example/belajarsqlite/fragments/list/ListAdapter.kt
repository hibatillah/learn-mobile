package com.example.belajarsqlite.fragments.list

import android.view.LayoutInflater
import android.view.*
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarsqlite.model.Jadwal
import androidx.navigation.findNavController
import com.example.belajarsqlite.R
import kotlinx.android.synthetic.main.custom_row.view.*
class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {
    private var jadwalList = emptyList<Jadwal>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewTyupe: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val curItem = jadwalList[position]
        holder.itemView.tx_hari.text = curItem.hari
        holder.itemView.tx_jam.text = curItem.waktu
        holder.itemView.tx_nama_mk.text = curItem.mataKuliah
        holder.itemView.tx_nama_dosen.text = curItem.namaDosen

        holder.itemView.cl_custom_row_layout.setOnClickListener {
            val aksi = ListFragmentDirections.actionListFragmentToUpdateFragment(curItem)
            holder.itemView.findNavController().navigate(aksi)
        }
    }

    fun tampilkanData(jadwal: List<Jadwal>) {
        this.jadwalList = jadwal
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return jadwalList.size
    }
}