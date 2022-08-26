package com.haydar.logickotlin.controlflow

import java.lang.Integer.sum

/* statment

    val openOffice = 7
    val now = 8
    if (now > openOffice)
        print("office already open")
    else
        print("office close")

  Pada contoh kode di atas, if dikatakan sebagai statement karena
  ia tidak mengembalikan nilai apapun, hanya sebagai percabangan pada bahasa Java

 */



/* expression

   namun yang menarik if dalam bahasa kotlin juga bisa digunakan
   sebagai Expression adalah Statment yang dapat mengembalikan
   nilai yang bisa kita simpan ke dalam sebuah variable

   contohnya

   fun main() {

    val openOffice = 7
    val now = 8

    val office = if (now > openOffice)
        "office already open" else "Office close"
    print(office)

    expression juga bisa terdapat subuah expression lagi

    fun main() {
    sum(1,1 * 4)
    }

    fun sum(value1: Int, value2: Int) = value1 + value2



 */

/* perbedaannya

fun main(){
    val value1 = 10
    val value2 = 10

    sum(value1,value2)
}

fun sum (value1:Int,value2: Int) = value1 + value2

pada kode di atas deklarasi variabel value1 dan value2
merupakan sebuah statement. Sedangkan pemanggilan fungsi
sum seperti yang dijelaskan di atas, merupakan sebuah expression.

 */





