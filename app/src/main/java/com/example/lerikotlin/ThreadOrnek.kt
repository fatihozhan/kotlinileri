package com.example.lerikotlin

fun main() {
    val birinciTheared = BirinciThread()
    birinciTheared.start()

    val ikinciThread = Thread(İkinciThread())
    ikinciThread.start()

    for (i in 900..999) {
        println("Main Thread : $i")
        Thread.sleep(100)
    }
}