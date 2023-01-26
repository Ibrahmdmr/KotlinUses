package com.example.xyz.collections

fun main(){

    val meyveler = setOf<String>("Çilek","Muz","Elma","Kivi")

    val iller = mutableListOf("Bursa","Ankara","İzmir","Rize")

    val sayilar = HashSet<Int>()

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)

    println(sayilar.toString())

    sayilar.add(21)
    println(sayilar.toString())

    println(sayilar.elementAt(1))

    println(sayilar.size)
    println(sayilar.count())

    println(sayilar.isEmpty())

    println(sayilar.contains(20))

    for (s in sayilar){
        println(s)
    }

    for ((i,s) in sayilar.withIndex()){
        println("$i -$s")
    }

    sayilar.remove(10)
    println(sayilar.toString())

    sayilar.clear() //bütün sayıları siler
    println(sayilar.toString())

}