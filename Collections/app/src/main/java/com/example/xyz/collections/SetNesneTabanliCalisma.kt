package com.example.xyz.collections

fun main(){

    val o1 = Ogrenci(1,"Ahmet","11/F")
    val o2 = Ogrenci(2,"Zeynep","10/R")
    val o3 = Ogrenci(3,"Ceyda","9/Z")

    val o4 = Ogrenci(1,"Ece","12/A")



    val ogrenciler = HashSet<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)

    for (o in ogrenciler){
        println("*********")
        println("Öğrenci no: ${o.no}")
        println("Öğrenvi adı: ${o.ad}")
        println("Öğrenci sınıfı: ${o.sinif}")
    }
    
}