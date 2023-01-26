package com.example.xyz.collections

fun main(){

    val o1 = Ogrenci(1,"Ahmet","11/F")
    val o2 = Ogrenci(2,"Zeynep","10/R")
    val o3 = Ogrenci(3,"Ceyda","12/A")
    val o4 = Ogrenci(4,"Mehmet","9/Z")
    val o5 = Ogrenci(5,"Yasin","11/F")

    val ogrenciler = ArrayList<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)


    for (o in ogrenciler){
        println("**************")
        println("Öğrenci No: ${o.no}")
        println("Öğrenci Ad: ${o.ad}")
        println("Öğrenci Sınıf: ${o.sinif}")
    }

    println("*** Filtreleme 1 ***")

    val sonucliste = ogrenciler.filter { it.no > 2 }

    for (s in sonucliste){
        println("**************")
        println("Öğrenci No: ${s.no}")
        println("Öğrenci Ad: ${s.ad}")
        println("Öğrenci Sınıf: ${s.sinif}")
    }

    println("*** Filtreleme 2 ***")

    val sonucliste2 = ogrenciler.filter { (it.ad).contains("a") }

    for (s in sonucliste2){
        println("**************")
        println("Öğrenci No: ${s.no}")
        println("Öğrenci Ad: ${s.ad}")
        println("Öğrenci Sınıf: ${s.sinif}")
    }

    println("*** Filtreleme 3 ***")

    val sonucliste3 = ogrenciler.filter { it.sinif == "11/F" }

    for (s in sonucliste3){
        println("**************")
        println("Öğrenci No: ${s.no}")
        println("Öğrenci Ad: ${s.ad}")
        println("Öğrenci Sınıf: ${s.sinif}")
    }

}