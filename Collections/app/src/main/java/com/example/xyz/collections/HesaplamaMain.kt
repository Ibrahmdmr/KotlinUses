package com.example.xyz.collections

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    // main project

    
    val h1 = Hesaplama0(5,4)
    val h2 = Hesaplama0(8,7)
    val h3 = Hesaplama0(9,7)
    val h4 = Hesaplama0(3,21)

    val hesap = ArrayList<Hesaplama0>()

    hesap.add(h1)
    hesap.add(h2)
    hesap.add(h3)
    hesap.add(h4)

    for (h in hesap) {
        println("Sayılarınız: ${h.sayi1} ve ${h.sayi2}'dir")

    }

    var a = Scanner(System.`in`)

    println("Yapılacak İşlemi seçiniz:")
    println("Toplama (1)")
    println("Çıkarma (2)")
    println("Çarpma (3)")
    println("Bölme (4)")

    val p = hesap
    var secim = a.nextInt()

    if (secim == 1){
        println("Toplama işlemi sonucnuz: ${h1.sayi1 + h1.sayi2}")
    }else if(secim == 2){
        println("Çıkarma işlemi sonucnuz: ${h2.sayi1 - h2.sayi2}")
    }else if(secim == 3){
        println("Çarpma işlemi sonucnuz: ${h3.sayi1 * h3.sayi2}")
    }else if(secim == 4){
        println("Bölme işlemi sonucnuz: ${h4.sayi1 / h4.sayi2}")
    }else{
        println("Lütfen doğru seçim yapınız!")
    }




}