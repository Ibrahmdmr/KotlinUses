package com.abc.ibrahim.xyz.kotlinscopefunction

fun main(){

/*    var name: String? = null
    var surName: String?= null
    var age: Int? = null
    var city: String? = null*/

    val user = UserInfo()
    user.name = "Mehmet"
    user.surName = "ÇELİK"
    user.age = 19
    user.city = "İstanbul"


    //apply
   val user2 = UserInfo().apply {
        name = "Mehmet"
        surName = "ÇELİK"
        age = 19
        city = "İstanbul"
    }

    print(user2.city)


    //with
    val list2 = arrayOf(1,2,3,4,5)
    with(list2){
        println("First Number: ${this.first()}")
        println("Last Number: ${this.last()}")
    }


    //let
    val list = arrayOf("a","b","c","d")
    val firstLetter = list?.let {
        it.first()
    }
    println(firstLetter)


    //run
    val rule = "3 hakkınız vardır."
    var rule2 = "Oyunu başlattıktan sonra gözünüzü kapatmanız gerekmektedir."

    val game = rule.run {
        rule2 = " Gözünüzü kapatmazsanız oyun biter."
        rule + rule2
    }

    println(game)


    //also
    val numbers = mutableListOf("bir", "iki", "üç")
    numbers
        .also { println("Sayı eklemeden önce listedeki sayı numaraları: $it")
        }
        .add("dört")

    println(numbers)

}

class UserInfo(){
    var name = "Ahmet"
    var surName = "Çelik"
    var age = 21
    var city = "İzmir"

    data class UserInfo2(var name:String? = null, var surName:String? = null, var age:Int? = 0)
}


