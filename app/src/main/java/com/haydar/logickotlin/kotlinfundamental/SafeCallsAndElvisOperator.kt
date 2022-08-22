package com.haydar.logickotlin.kotlinfundamental

/* Safe Cals Operator (?.)
   berfungsi untuk mengamankan kode yang kita tulis
   dari NullPointerExpection

   Dalam menggunakan safe call, kita akan mengganti
   tanda titik (.) dengan tanda (?.) saat mengakses
   atau mengelola nilai dari objek nullable.

   contohnya
   fun main() {
    val text: String? = null
    text?.length
}

 */

/* elvis operator (?:)
   elvis opetaror memungkinkan kita untuk menetapkan
   default value atau nilai dasar jika object
   bernilai null

   contohnya
   fun main() {
    val text : String? = null
    val textLength = text?.length ?:7
    println(textLength)
}
 */




