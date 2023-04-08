package com.example.xyz.nesnetabanliprogramlama

class Matematik {

    fun toplama(sayi1:Int, sayi2:Int){
        val topla = sayi1 + sayi2
        println("Toplam: $topla")
    }


    fun cikar(sayi1:Double,sayi2:Double):Double{
        return sayi1 - sayi2
    }


    fun carp(sayi1:Int,sayi2:Int,isim:String){
        val sonuc = sayi1 * sayi2
        println("Çarpma yapan $isim  Sonuç: $sonuc")
    }

    fun bol(sayi1:Double,sayi2:Double):String{
        return "Bölme: ${sayi1/sayi2}"
    }



}