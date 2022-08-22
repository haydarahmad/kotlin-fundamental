package com.haydar.logickotlin.kotlinfundamental

/* Array
   Selanjutnya adalah Array, yakni tipe data yang memungkinkan kita
   untuk menyimpan beberapa objek di dalam sebuah variabel.

   Array memiliki fungsi get dan set serta properti set
   untuk membuat Array kita bisa memanfaatkan sebuah libary function (arrayof())

   contohnya
   val array = arrayOf(1,2,3,4,5)

   kita juga bisa memaksukkan beberapa jenis tipe data kedalam arrayOf()

   contohnya
   val mixArray = arrayOf(1,2,3,"haydar",true)

   Kotlin juga memungkinkan kita untuk membuat Array dengan tipe data primitif
   dengan memanfaatkan beberapa fungsi spesifik berikut:

   intArrayOf() : IntArray

   booleanArrayOf() : BooleanArray

   charArrayOf() : CharArray

   longArrayOf() : LongArray

   shortArrayOf() : ShortArray

   byteArrayOf() : ByteArray

   jika ingin membuat Array yang hanya bisa memasukkan tipe dara int saja
   maka gunakan ( intArrayOf() )

   contohnya
   val intArray = intArrayOf(1,2,3,4,5)


   Kita juga bisa mendapatkan nilai tunggal dari sekumpulan nilai yang berada
   di dalam sebuah Array dengan memanfaatkan indexing seperti berikut

   fun main() {
    val intArray = intArrayOf(1,2,3,4,5)
    print(intArray[2])
}


   kita juga bisa mengubah nilai yang berada di arraynya

   contohnya
   fun main() {
    val intArray = intArrayOf(1,2,3,4,5)
    intArray[2] = 11
    print(intArray[2])
}


   Selain menggunakan library function arrayOf() dalam pembuatan objek Array,
   kita juga bisa menggunakan Array(). Constructor pada Array() membutuhkan 2
   argumen yaitu size dan fungsi lambda. Contoh untuk membuat Array
   menggunakan Array() adalah seperti berikut

   val intArray = Array(4,{i -> i * i})
 */








