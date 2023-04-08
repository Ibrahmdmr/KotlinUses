package com.example.xyz.nesnetabanliprogramlama

fun main(){

    val bmw = Araba("Kırmızı", 10, false)

   bmw.bilgiAl()

    bmw.hiz = 900
    bmw.renk = "Beyaz"
    bmw.calisiyorMu = true

    bmw.bilgiAl()

    bmw.durdur()
    bmw.bilgiAl()

    bmw.calistir()
    bmw.bilgiAl()

    bmw.hizlan(100)
    bmw.hizlan(30)
    bmw.bilgiAl()

    bmw.yavasla(50)
    bmw.bilgiAl()


    val sahin = Araba("Sarı", 100, true)

    sahin.bilgiAl()

    sahin.hizlan(100)
    sahin.bilgiAl()

    sahin.durdur()
    sahin.bilgiAl()





}