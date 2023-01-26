package com.example.xyz.collections

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    val girdi = Scanner(System.`in`)

    val dersNotlariListesi = ArrayList<DersNotlar>()


    while (true){

        println("Dersin adını giriniz")
        val ders = girdi.next()

        println("Dersin notunu giriniz")
        val not = girdi.nextInt()

        val yeniNot = DersNotlar(ders,not)

        dersNotlariListesi.add(yeniNot)

        println("Çıkmak için (1) - Devam etmek için diğer sayılar")
        val cikis = girdi.nextInt()

        if (cikis == 1){

            println("***********")

            var toplam = 0

            for (dn in dersNotlariListesi){
                println("${dn.ders}: ${dn.not}")
                toplam = toplam + dn.not
            }

            val ortalama = toplam / dersNotlariListesi.size
            println("******************")
            println("Ortalama: $ortalama")

            if (ortalama >= 50){
                println("GEÇTİNİZ")
            }else{
                println("KALDINIZ")
            }

            println("Çıkış yapılıyor...")
            println("Çıkış yapıldı")
            break
        }
    }





}