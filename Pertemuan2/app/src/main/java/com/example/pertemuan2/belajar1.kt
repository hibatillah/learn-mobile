package com.example.pertemuan2

fun main() {
    println("Hai Teman\" Sistem Informasi")
    println("Selamat sudah berhasil naik semester 5")

    var angka = 15
    println("Hasil dari 15 + 10 = ${angka + 10}")

    val nilaiInt = 10_000
    val nilaiDouble = 100.003
    val nilaiFloat = 100.00f
    val nilaiLong: Long = 100_000_000_004
    val nilaiShort: Short = 10
    val nilaiByte: Byte = 1

    println("Nilai Integer $nilaiInt")
    println("Nilai Double $nilaiDouble")
    println("Nilai Float $nilaiFloat")
    println("Nilai Long $nilaiLong")
    println("Nilai Short $nilaiShort")
    println("Nilai Byte $nilaiByte")

    val huruf = 'a'
    println("Ini penggunaan karakter '$huruf'")

    val nilaiBoolean = true
    println("Nilai boolean yang dibuat adalah $nilaiBoolean")

    val nilaiString = "Mawar Eva"
    println("Halo $nilaiString! \nApa kabar?")
}