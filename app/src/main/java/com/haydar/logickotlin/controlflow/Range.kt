package com.haydar.logickotlin.controlflow

/* Range
   untuk menentukan nilai awal dan akhir pada range
   Range direpresentasikan dengae operator (..)
   atau dengan fungsi rangeTo() dan downTo()

   contoh sederhananya:
   val rangeInt = 1..10

   jarak antara dua nilai yang dicakup dapat ditentukan
   menggunakan step.
   secara default step bernilai 1

   contohnya:
   fun main() {
    val rangeInt = 1..10
    print(rangeInt.step)
}

   untuk mengubah nilai dari step bisa kita lakukan
   ketika kita menginisialisasikan nilai yang dicakup
   range itu sendiri

   contohnya:
   fun main() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
   println(rangeInt.step)
}

 berikut adalah contoh rangeTo():
 val rangeInt = 1.rangeTo(10)

 kita bisa juga mementukan nilai yang mencakup range
 secara terbalik dengan menggunakan downTo()
 val downInt = 1.downTo(10)

 */





