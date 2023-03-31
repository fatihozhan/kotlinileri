package com.example.lerikotlin

fun main() {
    val x = 10
    val y = 4
    val dizi = Array<Int>(2) { 0 }
    try {
        println("Sonuç : ${x / y}")
        println("İşlem Tamam")
        dizi[4] = 8
    } catch (e: java.lang.Exception) {
        println(e)
        if (e is ArithmeticException) {
            println("İkinci sayı sıfıra bölünemez")
        }
        if (e is ArrayIndexOutOfBoundsException) {
            println("Dizinin boyutunu aştınız.")
        }
    }
}