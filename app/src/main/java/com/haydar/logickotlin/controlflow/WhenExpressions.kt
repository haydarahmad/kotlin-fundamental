package com.haydar.logickotlin.controlflow

import kotlin.random.Random

/* WhenExpressions

   untuk memenentukan sebuah statment atau expressions kita menggunakan
   if expression. selain itu kita juga bisa gunakan whenExpression

   contohnya
fun main() {
    val value = 7

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }
}

 when akan mencocokkan semua argumen yang berada di branch
 secara berurutan , di dalam when kita juga bisa menambahkan
 else seperti berikut

fun main() {
    val value = 20

    when(value){
        1 -> println("value is 1")
        2 -> println("value is 2")
        3 -> println("value is 3")
        else -> println("value cannot be reached")
    }
}

else akan dijalankan ketika tidak ada yang terpenuhi di when

 when expression juga bisa mengembalikan nilai dan dapat di simpan
 di variable

fun main() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }
    println(stringOfValue)
}

 else adalah hal wajib yang harus ditambahkan dalam penggunaan when
 jika tidak akan ada error seperti berikut

 'when' expression must be exhaustive, add necessary 'else' branch

 jika memiliki dua atau lebih baris kode yang dijalankan di setiap branchnya
 bisa kita memindahkannya ke dalam curly braces

fun main() {
    val value = 7
    val stringOfValue = when (value){
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undifined")
            "value cannot be reached"
        }
    }
    println(stringOfValue)
}

  when juga memungkinkan kita untuk memeriksa instance dengan tipe tertentu dari sebuah
  objek menggunakan is atau !is

  fun main() {
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a long type")
        is String -> println("the value has a String type")
        else -> println("undifined")
    }
}
  berikut adalah contoh ketika kita hendak mengecek apakah sebuah
  nilai ada di dalam sebuah range atau tidak

  fun main() {
    val value = 27
    val ranges = 10..50

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undifined")
    }
}

  sejak kotlin 1.3 kita dapat menangkap subjek dari when expression di dalam
  sebuah variable

  fun main() {
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
}

fun getRegisterNumber() = Random.nextInt()

fun main() {
    val anyType : Any = 100L
    if (anyType is Long){
        println("the value has a long type")
    } else {
        println("the value is not Long type")
    }
}

 jika banyak percabangan kita bisa mengunakan when
 expression
 fun main() {
    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a Int typ")
        is Double -> println("the value has a Double type")
        else -> println("undifined")
    }
}

 */
















