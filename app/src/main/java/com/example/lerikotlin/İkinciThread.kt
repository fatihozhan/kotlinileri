package com.example.lerikotlin

class İkinciThread: Runnable {
    override fun run() {
        for (i in 200..299){
            println("İkinci Thread : $i")
            Thread.sleep(100)
        }
    }
}