package com.example.belajarfirebase

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import com.example.belajarfirebase.databinding.ActivityTambahDetilBinding

class TambahAnggota : AppCompatActivity() {
    private lateinit var detilList: MutableList<DetilAnggota>
    private lateinit var ref: DatabaseReference
    private lateinit var binding: ActivityTambahDetilBinding

    companion object{
        const val EXTRA_ID ="extra_id"
        const val EXTRA_NAMA= "extra_nama"
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityTambahDetilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getStringExtra(EXTRA_ID)
        val nama = intent.getStringExtra(EXTRA_NAMA)

        detilList = mutableListOf()
        ref = FirebaseDatabase.getInstance().getReference("dewtil anggota").child(id!!)
        ref.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot){
                if (snapshot.exists()){
                    detilList.clear()
                    for (a in snapshot.children){
                        val detil = a.getValue(DetilAnggota::class.java)
                        if (detil != null){
                            detilList.add(detil)
                        }
                    }
                    val adapter = DetilAnggotaAdapter(this@TambahAnggota,
                        R.layout.activity_item_detil, detilList)
                    binding.lvTambahDetil.adapter = adapter

                    println("Output : " +detilList)
                }
            }
            override fun onCancelled(error: DatabaseError){
                TODO("Not Yet Implemented")
            }
        })
        binding.btnTambahDetil.setOnClickListener {
            simpanDetil()
        }
    }
    private fun simpanDetil(){
        val alamat =  binding.edtAlamat.text.toString().trim()
        val kodePos =  binding.edtKodePos.text.toString()

        if (alamat.isEmpty()) {
            binding.edtAlamat.error = "isi alamat telebih dahulu"
            return
        }
        if (kodePos.isEmpty()){
            binding.edtKodePos.error="Isi kode pos terlebih dahulu"
            return
        }
        val detailId = ref.push().key

        val detil = DetilAnggota(detailId!!, alamat, kodePos)

        ref.child(detailId).setValue(detil).addOnCompleteListener{
            Toast.makeText(applicationContext,"Informasi tambahan berhasil ditambahkan",
                Toast.LENGTH_SHORT)
                .show()
        }
    }
}