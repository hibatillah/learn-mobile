package com.example.pertemuan2

fun main() {
    for (n in 20..30) {
        if (n % 1 != 0)
            continue
        println("$n")
    }

    for (n in 5..10) {
        println("Sebelum continue, nilai: $n")
        if (n == 6 || n == 8)
            continue
        println("Sesudah continue, nilai: $n")
    }

    for (x in 'A'..'D') {
        for (n in 1..5) {
            if (n == 2 || n == 4)
                continue
            println("$x and $n")
        }
    }
}