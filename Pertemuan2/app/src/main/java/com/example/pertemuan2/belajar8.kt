package com.example.pertemuan2

fun main() {
    var angka = 10

    while (angka >= 5) {
        println("Iterasi : $angka")
        angka--
    }

    var nilai = 0
    do {
        nilai = nilai + 10
        println("Nilai ini berada dalam do : $nilai")
    } while (nilai <= 50)
}