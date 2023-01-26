package com.example.xyz.collections

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    val personeller = ArrayList<Personel>()

    for (i in 1..5){ // 1,2,3,4,5
        println("$i. Personel ad: ")  //1.personel ad
        val isim = girdi.next()

        println("$i. Personel adres il: ")
        val il = girdi.next()

        println("$i. Personel adres ilçe: ")
        val ilce = girdi.next()

        val adres = Adres(il,ilce)

        val personel = Personel(i,isim,adres)

        personeller.add(personel)

    }

    for (p in personeller){
        println("**************")
        println("Personel no: ${p.no}")
        println("Personel ad: ${p.isim}")
        println("Personel adres il: ${p.adres.il}")
        println("Personel adres ilçe: ${p.adres.ilce}")

    }

}