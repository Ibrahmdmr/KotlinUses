package com.example.xyz.collections

fun main(){

    val sayilar = ArrayList<Int>()

    sayilar.add(30)
    sayilar.add(40)
    sayilar.add(10)
    sayilar.add(60)
    sayilar.add(100)
    sayilar.add(60)

    var toplam = 0

    for (s in sayilar){
        toplam = toplam + s
    }

    println("Ortalama: ${toplam / sayilar.size}")

}