package com.example.pertemuan3

fun main() {
    namaKu()
    contohReturn("Budi", 12)
    println("Ini hasil dari function jumlah : ${jumlah(5, 10, 15, 20)}")
}

fun namaKu() {
    println("M. Hibatillah")
}

fun contohReturn(nama: String, umur: Int) {
    println("Halo, namaku $nama, umurku $umur tahun")
}

fun jumlah(vararg angka: Int): Int {
    var hasilJumlah = 0
    angka.forEach { nilai -> hasilJumlah += nilai }

    return hasilJumlah
}