package com.haydar.logickotlin.kotlinfundamental

/* if expression
  Saat mengembangkan sebuah program, kita pasti bertemu dengan
  alur program yang perlu sebuah kondisi untuk menjalankan sebuah
  statement atau expression.

  if expression mengunakan kata kunci (if)
  if digunakan ketika kita ingin menguji suatu kondisi
  dalam menjalankan proses

  If akan mengeksekusi sebuah statement atau expression jika
  hasil evaluasi dari expressions yang diberikan pada blok if bernilai true.
  Sebaliknya, jika bernilai false maka proses yang ditentukan akan dilewatkan.

  contohnya
fun main() {
    val openHours = 7
    val now = 20

    if (now > openHours){
        println("office alredy open")
    }
}

 jika kita ingin melakukan seleksi atau jika ingin menambahkan opsi kita harus
 menggukan (else)

 contohnya
 fun main() {
    val openHours = 7
    val now = 20
    val office:String

    if (now > openHours){
        office = "office alredy open"
    }else {
        office = "office is closed"
    }

    print(office)
}

 else akan dijalankan ketika kondisinya false

 If merupakan sebuah expressions yang dapat mengembalikan nilai,
 sehingga kita dapat menyimpan hasilnya ke dalam sebuah variabel

 contohnya
fun main() {
    val openHours = 7
    val now = 20
    val office: String

    office = if (now > openHours ){
        "office alredy open"
    } else{
        "office is closed"
    }

    print(office)

}

  jika ingin kondisinya lebih banyak gunakan (else if)

  contohnya

 */

fun main() {
    val openHours = 7
    val now = 7
    val office:String

    office = if (now > 7) {
        "office always open"
    } else if (now == openHours ){
        "wait a minute, office will be open"
    } else{
        "office is closed"
    }

    print(office)
}






