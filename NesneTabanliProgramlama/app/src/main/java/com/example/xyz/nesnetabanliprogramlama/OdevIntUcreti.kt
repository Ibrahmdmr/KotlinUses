package com.example.xyz.nesnetabanliprogramlama

class OdevIntUcreti {

    fun intUcreti(kotaBilgisi:Int):Int{
        if(kotaBilgisi <= 50){
            println("Ücretiniz: ${kotaBilgisi*2}")
        }else if(kotaBilgisi > 50){
            println("Ücretiniz: ${kotaBilgisi*2 + (kotaBilgisi - 50) * 4}")
        }
        return kotaBilgisi

    }


}