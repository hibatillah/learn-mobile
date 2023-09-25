package com.example.pertemuan3

fun main() {
    println("Coba exception Handling 1")
    try {
        val testError = 10 / 0
        println("Contoh error")
        println(testError)
    } catch (e: ArithmeticException) {
        println("Arithmetic Exception")
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Pada block finally, apapun itu yang terjadi tetap di print")
    }

    /*==========================*/

    println("\nCoba exception handling 2")
    contohError()
}

fun contohError() {
    try {
        println("Sebelulm exception")
        throw Exception("Hayoooo masalahnya masuk ke Throw")
        println("Sesduah exception")
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Masih error, tapi finally tetap muncul ya")
    }
}