package com.example.exampleflowoperators.example

import android.util.Log
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.Thread.State

//
/*   fun getSequence(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(100)
        emit(i)
    }
}

fun main() = runBlocking {
    getSequence().collect {value ->
        println(value)
    }
}*/

  //flow()   //emit ve collect 3 defa döner.
 /* fun getSequence(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(100)
        println("emit - değer: $i")
        emit(i)
    }
}
fun main() = runBlocking {
    val f = getSequence()
    println("coolect-toplam cağırıldı")
    f.collect { value ->
        println("Collected - Toplam: $value")
    }
} */

  // asFlow()   //önce 1. blok çalışır daha sonra 1. bloğun çalışması bitince 2. blok çalışır.
 /* fun main() = runBlocking {
      val f = (1..3).asFlow()
      println("1. Start to collect - Çağırılan Değer")
      f.collect { value ->
          println("Collected $value")
      }
      println("2. Start to collect - Çağırılan Değer")
      f.collect { value ->
          println("Collected $value")
      }
  } */


   //flowOf()  //akış oluşturup değerleri akışa sokar.
  /* fun main() = runBlocking {
       val f = flowOf(1, 2, 3)
       println("1. Start to collect - Çağırılan Değer")
       f.collect { value ->
           println("Collected $value")
       }
       println("2. Start to collect- Çağırılan Değer")
       f.collect { value ->
           println("Collected $value")
       }
   } */


      //Operators

  //map()   //değerleri verilen işleme göre değiştirir.
  /* fun main() = runBlocking {
      (2..4).asFlow()
          .map { it * it }
          .collect { println("Değer $it") }
} */


  //filter()  //değerlerimize koşul ekleyebilmemizi sağlar.
 /* fun main() = runBlocking {
      (1..10).asFlow()
          .filter { it % 3 == 1 }
          .collect { println(it) }
  } */


  //transform()   //filtre'nin emit ile beraber olan hali.
  /* fun main() = runBlocking {
      (1..10).asFlow()
         // .map { it + 20 }
          .transform {
              if (it % 2 == 0) {
                  emit(it)
                  emit(it.plus(5))
              }
          }
          .collect { println(it) }
  }  */


  //reduce()   //değerleri belirtilen işleme göre flow'da döndürür.   //accumulator işimizi oldukça kolaylaştrır.
 /*  fun main() = runBlocking {
      val sum = (1..5).asFlow()
          .reduce { accumulator, value ->
              println("accumulator=$accumulator, value=$value")
              accumulator + value
          }
      println("Son toplam değer: $sum")
  }  */


   //fold()   //reduce'ye ek olarak dönecek işleme ekleme yapar 100 + 15 = 115 gibi.
 /*  fun main() = runBlocking {
       val result = (1..5).asFlow()
           .fold(100) { accumulator, value ->
               println("accumulator=$accumulator, value=$value")
               accumulator + value
           }
       println("Dönüş değeri: $result")
   } */


   //floMapContant()  //flowMapContent() ile özelleştirmeler yapılabilir.
 /*  fun double(value: Int) = flow {
       emit(value)
       delay(100)
       emit(value)
   }
fun main() = runBlocking {
    (1..3).asFlow()
        .flatMapConcat { double(it) }
        .collect { println(it) }
}  */

 // Rest API işlemlerinde collect yerine single() kullanılabilir çünkü Rest API yalnızca bir defa döndürülür.


   //flowMapMerge   //Döndürülen tüm akışları aynı anda yürütür.
  /* fun double(value: Int) = flow {
       emit(value)
       delay(100)
       emit(value)
   }
  fun main() = runBlocking {
    (1..3).asFlow()
        .flatMapMerge { double(it) }
        .collect { println(it) }
} */


    //zip()   //değerleri birleştirip yeni bir akış oluşturur.
  /*  fun main() = runBlocking {
        val numbers = (1..3).asFlow()
            .onEach { delay(500) }
        val starts = flowOf('a', 'b', 'c', 'd')
            .onEach { delay(500) }
        numbers.zip(starts) { a, b -> "$a -> $b" }
            .collect { println(it) }
    }  */


   //combine()   //eşleştirme kaynağı gelir gelmez çalışır.
   /* fun main() = runBlocking {
       val nums = (1..3).asFlow()
           .onEach { delay(29) }
       val strs = flowOf('a', 'b', 'c', 'd')
           .onEach { delay(37) }
       nums.combine(strs) { a, b -> "$a -> $b" }
           .collect { println(it) }
   } */


   //onEach()  //bazı hatların yazılması
  /* fun main() = runBlocking {
       ('a'..'c').asFlow()
           .onEach { println("Check: $it") }
           .map { it.toInt() }
           .collect {
               println("Değer: $it")
           }
   } */


   //catch()  //bir akıştan bir istisna atıldığında
   /*  fun main() = runBlocking {
       (1..5).asFlow()
           .onEach { if (it > 3) throw Exception("Value should not larger than 3") }
           .catch { e -> println("Caught exception: $e") }
           .onCompletion { println("Tamamlandı") }
           .collect { println("Değer: $it") }
   } */


   //flowOn()
 /*  fun main() = runBlocking {
       (1..2).asFlow()
           .onEach { println("onEach1: $it is on ${Thread.currentThread().name}") }
           .onEach { println("onEach2: $it is on ${Thread.currentThread().name}") }
           .flowOn(Dispatchers.IO)
           .onEach { println("onEach3: $it is on ${Thread.currentThread().name}") }
           .collect { println("collect: $it is on ${Thread.currentThread().name}") }
   } */


     //stateFlow() //
 /* fun main() = runBlocking {
    val stateFlow = MutableStateFlow(0)
     launch {
      stateFlow.collect {
       println("StateFlow: $it")
   }
  }
    delay(1000)
    stateFlow.value = 1
    delay(1000)
    stateFlow.value = 2
}  */



    //sharedFlow()    //
/* fun main() = runBlocking {
        val sharedFlow = MutableSharedFlow<Int>()
        launch {
            sharedFlow.collect {
                println("SharedFlow: $it")
            }
        }
        delay(500)
        sharedFlow.emit(1)
        delay(500)
        sharedFlow.emit(2)
        delay(500)
        sharedFlow.emit(3)
    } */
