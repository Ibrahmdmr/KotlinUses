package com.example.xyz.collections

fun main(){

    val meyveler = ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    println(meyveler.isEmpty()) // ArrayList boş mu?  // false boş değil
    println(meyveler.count()) // boyutunu verir
    println(meyveler.size) // boyutunu verir
    println(meyveler.first()) // ilk elaman
    println(meyveler.last()) // son elaman

    println(meyveler.contains("Kira")) // false

    // println(meyveler.max())
   //  println(meyveler.min())

    meyveler.sort()
    println(meyveler.toString())

    meyveler.reverse() // tersten sıralama
    println(meyveler.toString())

    meyveler.removeAt(3) // 3.indexsteki veriyi siler
    println(meyveler.toString())

    meyveler.remove("Kivi") // siler
    println(meyveler.toString())

    meyveler.clear() // bütün ArrayList'i siler
    println(meyveler.toString())





}