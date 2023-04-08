package com.example.xyz.nesnetabanliprogramlama

class Odev7 {

    fun intUcreti(kotaBilgisi:Int):Int{
        if(kotaBilgisi <= 50){
            println("Ücretiniz: ${kotaBilgisi*2}")
        }else if(kotaBilgisi > 50){
            println("Ücretiniz: ${50*2 + (kotaBilgisi - 50) * 4}")
        }
return kotaBilgisi

    }

}