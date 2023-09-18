package com.example.pertemuan2

fun main() {
    val cobaArray = arrayOf("Silahkan", "Tuliskan", "Apa", "Saja", 'A')
    println("Data cobaArray index 0 : ${cobaArray[0]}")
    println("Data cobaArray index 3 : ${cobaArray[4]}")
    println("Isi seluruh cobaArray : ${cobaArray.contentDeepToString()}")
    println("Panjang cobaArray : ${cobaArray.size}")
    println("Get cobaArray index 2 : ${cobaArray.get(2)}")

    val cobaArray2 = arrayOf(1, 2, 3, 4, 5)
    println("Data cobaArray2 index 2 : ${cobaArray2[2]}")
    println("Isi seluruh cobaArray : ${cobaArray2.contentDeepToString()}")
    println("Panjang cobaArray : ${cobaArray2.size}")

    cobaArray2.set(4, 10)
    println("Hasil cobaArray 2 index 4 setelah di set : ${cobaArray2[4]}")


    val cobaArray3 = cobaArray + cobaArray2
    print(" cobaArray3 $cobaArray3")
}