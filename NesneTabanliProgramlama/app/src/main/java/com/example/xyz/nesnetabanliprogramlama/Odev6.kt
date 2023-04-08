package com.example.xyz.nesnetabanliprogramlama

class Odev6 {


    fun maashesabi(gunSayisi:Int):Int{

        val gunlukCalismaSaati = 8
        val saatlikCalismaUcreti = 10
        val gunlukUcret = 8*20*10
        if(gunSayisi > 20){
            println("Maaşınız: ${gunlukUcret + (gunSayisi-20) * 8 *20}")
        }else if(gunSayisi < 20) {
            println("Maaşınız: ${gunSayisi * 8 *10}")
        }
return gunlukCalismaSaati
    }




}