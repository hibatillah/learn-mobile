package com.example.belajarfirebase

data class DetilAnggota(
    val id: String,
    val alamat: String,
    val kodePos: String,
) {
    constructor() : this("", "", "")
}