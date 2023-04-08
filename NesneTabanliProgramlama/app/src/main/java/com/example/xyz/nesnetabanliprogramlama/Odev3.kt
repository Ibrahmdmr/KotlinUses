package com.example.xyz.nesnetabanliprogramlama

class Odev3 {

    // 3 - 3*2*1
    // 3 - 3+2+1

    fun faktoriyelhesapla(sayi:Int):Int{
        var sonuc = 1

        for (i in 1..sayi){ // 3 - 1*2*3
            sonuc = sonuc * i
        }
        return sonuc
    }

}