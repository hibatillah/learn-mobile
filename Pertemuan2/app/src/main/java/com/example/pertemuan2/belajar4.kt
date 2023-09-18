package com.example.pertemuan2

fun main() {
    val satuToSepuluh = 1..10
    println("adakah 5 antara 1-10? : ${5 in satuToSepuluh}")
    println("adakah 11 antara 1-10? : ${11 in satuToSepuluh}")

    val hurufAZ = 'A'..'Z'
    println("adakah R antara A-Z? : ${'K' in hurufAZ}")
    println("adakah € antara A-Z? : ${'€' in hurufAZ}")

    for (angka in 1..5) {
        print(" $angka")
    }

    val satuToLima = 1.rangeTo(5)
    print("\nRangenya 1-5:")
    for (x in satuToLima) {
        print(" $x")
    }

    val tujuhToDua = 7.downTo(2)
    print("\nRangenya 7-2:")
    for (y in tujuhToDua) {
        print(" $y")
    }
}