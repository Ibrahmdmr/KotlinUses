package com.example.xyz.degiskenveveritipleri

import java.lang.Exception

fun main () {

   var i:Int = 42
   var d:Double = 42.45
   var f:Float = 42.89f

   var sonuc1:Int = d.toInt()
   var sonuc2:Double = i.toDouble()
   var sonuc3:Int = f.toInt()

   println(sonuc1)
   println(sonuc2)
   println(sonuc3)

   var str1 = i.toString()
   var str2 = d.toString()
   var str3 = f.toString()

   println(str1)
   println(str2)
   println(str3)

   // Yöntem1
    var yazi1 = "34t"
try {
    var x = yazi1.toInt()
   println(x)

}catch (e:Exception){
   println("Dönüşümde hata oluştu")
}

   // Yöntem2

   var yazi2 = "48.56"

   var y = yazi2.toDoubleOrNull()
   if (y != null) {
      println("Y: $y")
   }else {
      println("Dönüşümde hata oluştu")
   }
   // Yöntem 3

   var yazi3 = "67"
   var z = yazi3.toIntOrNull()

   z?.let{
      println("Z: $z") 
   }










}