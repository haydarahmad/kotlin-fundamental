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

/* String template

   Sebuah fitur yang memungkinkan kita untuk menyisipkan sebuah variabel ke
   dalam sebuah String tanpa concatenation (penggabungan objek String menggunakan +)

   Untuk menggunakan string template, kita hanya perlu menambahkan karakter $
   sebelum nama variabel yang akan disisipkan seperti berikut

   fun main() {
    val name = "kotlin"
    print("my name is " + $name)

}


   Variabel yang dapat disisipkan tidak sebatas String. Kita juga bisa
   menyisipkan objek lain misal Int atau Double seperti berikut

   fun main() {
    val name = "kotlin"
    val old = 3

    print("my name is $name, im $old years old")
}

 kita juga bisa menyisipkan sebuah expression ke dalam sebuah string
 tamplate

 fun main() {
    val hour = 7
    print("office ${if (hour > 7)"alredy close" else"is open"}")
}
 */











