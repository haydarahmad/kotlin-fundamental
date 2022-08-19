package com.haydar.logickotlin.kotlinfundamental

/* char
 untuk mendefinisikan tipe char pakai kutip tunggal ('')
 tipe char hanya berisi 1 karakter

 example
 val char = 'A'

 kita juga bisa melakukan operasi increment (++) dan decrement (--)
 example

 kita bisa melakukan operasi increment dan decrement pada char karena
 pada dasarnya char itu unicode
 contoh
 A adalah 0041 jika di incremant makan hasilnya 0042 yaitu B
 */

fun main() {
    var vocal = 'A'

    println("Vocal" + vocal++)
    println("Vocal" + vocal++)
    println("Vocal" + vocal++)
    println("Vocal" + vocal--)
    println("Vocal" + vocal--)
    println("Vocal" + vocal--)
    println("Vocal" + vocal--)

}