package com.example.xyz.collections

fun main(){

    val sayilar = mapOf<Int,String>(1 to "Bir",2 to "İki")

    val oranlar = mutableMapOf<Double,String>(1.5 to "Oran1",3.4 to "Oran2")

    val iller = HashMap<Int,String>()

    iller.put(16,"BURSA")
    iller.put(34,"İSTANBUL")

    println(iller.toString())

    iller.put(16,"YENİ BURSA")
    println(iller.toString())

    println(iller.get(34))

    println(iller.size)
    println(iller.count())

    println(iller.isEmpty())
    println(iller.containsKey(16)) // true-false
    println(iller.containsValue("İSTANBUL")) // true-false

    for ((anahtar,deger) in iller){
        println("$anahtar: $deger")
    }

    iller.remove(16)
    println(iller.toString())

    iller.clear()
    println(iller.toString())
}