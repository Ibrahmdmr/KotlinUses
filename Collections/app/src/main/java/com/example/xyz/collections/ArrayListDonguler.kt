package com.example.xyz.collections

fun main(){

    val meyveler = ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    for (meyve in meyveler){
        println("Sonuç: $meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()){
        println("${indeks+1}. meyve:  $meyve")
    }




}