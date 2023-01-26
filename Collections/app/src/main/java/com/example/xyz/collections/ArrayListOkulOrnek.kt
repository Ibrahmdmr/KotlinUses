package com.example.xyz.collections

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    var sayac = 1

    val ogrenciler = ArrayList<Ogrenci>()


    while (true){

        println("Öğrenci adı giriniz")
        val ad = girdi.next()

        println("Öğrenci sınıfı giriniz")
        val sinif = girdi.next()

        val yeniOgrenci = Ogrenci(sayac,ad,sinif)
        sayac +=1

        ogrenciler.add(yeniOgrenci)

        println("Çıkmak için (1) - Devam etmek için diğer sayılar")
        val cikis = girdi.nextInt()

        if (cikis == 1){

            for (ogrenci in ogrenciler){
                println("*********")
                println("Öğrenci no'su: ${ogrenci.no}")
                println("Öğrenci Adı: ${ogrenci.ad}")
                println("Öğrenci sınıfı: ${ogrenci.sinif}")
            }
            println("Çıkış yapılıyor...")
            println("Çıkış yapıldı")
            break
        }
    }


}