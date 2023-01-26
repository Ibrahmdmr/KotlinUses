package com.example.xyz.collections

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    val isimler = ArrayList<String>()

    isimler.add("Ahmet")
    isimler.add("Mehmet")
    isimler.add("Zeynep")
    isimler.add("Sedat")
    isimler.add("Ercan")

    println("Aratmak için isim giriniz")
    val isim = girdi.next()

    for (i in isimler){
        if (i == isim){
            println("İsim Mevcut")
            break
        }

    }



}