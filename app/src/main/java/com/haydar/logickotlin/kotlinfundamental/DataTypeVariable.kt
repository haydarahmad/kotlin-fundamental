package com.haydar.logickotlin.kotlinfundamental

// val immutable
// var muttable

/*
   pada umumnya variable digunakan untuk menyimpan informasi atau nilai
   yang akan dikelola di dalam sebuah program
 */


/*
   variable membutuhkan kata kunci var atau val, identifier,type,dan initialization
 */
// var identifier: Type = initalization

// contoh tipe string
//var company:String = "haydar"

/* identifier
   merupakan sebuah nama dari variable
 */

/* type
    tipe data dari variabel
    karena kotlin memakai type inference jadi tidak perlu
 */

/* initialization
   merupakan nilai awal dari sebuah variabel
 */

// contoh mengunakan operator (+) pada tipe string
//fun main() {
//    val firstWord = "Dicoding"
//    val lastword = "Academy"
//    print(firstWord + lastword)
//}

// contoh mengunakan operator (+) pada tipe int
fun main() {
    val valueA: Int = 10
    val valueB = 20
    print(valueA + valueB)
}
