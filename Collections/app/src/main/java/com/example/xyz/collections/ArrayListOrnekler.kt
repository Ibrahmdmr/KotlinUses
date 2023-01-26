package com.example.xyz.collections

fun main(){

    //ArrayList oluşturma yöntemleri
    val liste = ArrayList<String>()

    val liste2 : ArrayList<Int> = ArrayList<Int>()


    // Veri ekleme & listeleme

    val meyveler = ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

  println(meyveler.toString())

    val str = meyveler.get(2)
    println(str)

    val str1 = meyveler[4]
    println(str1)

    meyveler.add("Mandalina")
    println(meyveler.toString())

    meyveler[2] = "Ananas"
    println(meyveler.toString())

    meyveler.add(3,"Portakal")
    println(meyveler.toString())


}