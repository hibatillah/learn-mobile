package com.example.pertemuan2

fun main() {
    for (nilai in 15..25) {
        print(" $nilai")
    }

    val kampusKu = arrayOf("Kampus", "Politeknik", "Caltex", "Riau")
    for (kampus in kampusKu) {
        println(kampus)
    }

    for (n in kampusKu.indices) {
        println("Isi array [$n] = ${kampusKu[n]}")
    }

    val cobaArray = arrayOf(2, 4, 5, 6, 8)
    for ((idx, nilai) in cobaArray.withIndex()) {
        println("Isi pada index $idx adalah : $nilai")
        if (nilai % 2 == 0) {
            println("Bilangan genap : $nilai")
        } else {
            println("Bilangan ganjil : $nilai")
        }
    }
}