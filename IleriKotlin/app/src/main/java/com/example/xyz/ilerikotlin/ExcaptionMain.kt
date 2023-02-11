package com.example.xyz.ilerikotlin

import java.lang.ArithmeticException

fun main(){

    val x = 10
    val y = 2

    val dizi = Array<Int>(2){0} // 0,0

    try {
        println("Sonuç: ${x/y}")
        println("İşlem tamam")
        dizi[4] = 8
    }catch (e:ArithmeticException) {
        println("Sayı 0'a bölünemez")
    }

    catch (e:ArrayIndexOutOfBoundsException){
        println("Dizi buyutunu aştınız")

    }

       /* if (e is ArithmeticException){
        println("Sayı 0'a bölünemez")
        }
        if (e is ArrayIndexOutOfBoundsException){
            println("Dizi buyutunu aştınız")
        }*/

}