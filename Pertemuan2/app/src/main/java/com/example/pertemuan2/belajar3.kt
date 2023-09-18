package com.example.pertemuan2

fun main() {
    val kataMutable = mutableListOf("Hai", "Halo", "Aloha")
    println("List mutable: $kataMutable")

    kataMutable.add("Hi")
    kataMutable.removeAt(0)

    println("List mutbale setelah di teambahkan = $kataMutable")
    println("List mutable setelah di hapus = $kataMutable")

    kataMutable.shuffle()
    println("List mutable setlah shuffle = $kataMutable")

    val kataImmutable: List<String> = kataMutable
    println(kataImmutable)

    println("Kata pertama dari mutable : ${kataImmutable.first()}")

    val cobaSet = setOf("Belajar", "Pemrograman", "Mobile", "Belajar")
    println("Set : $cobaSet")

    val cobaMap = mapOf(1 to "Shumaya", 2 to "Resty", 3 to "Ramadhani")
    println("Map : ${cobaMap.values}")
}