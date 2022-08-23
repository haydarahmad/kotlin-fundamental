package com.haydar.logickotlin.controlflow

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

}
 */

