package com.haydar.logickotlin.kotlinfundamental

/* String
 String digunakan untuk menyimpan nilai berupa teks

 contoh
 val textString = "Kotlin"

 pada dasarnya string itu array jadi kita bisa mudah
 mendapatkan karakter tunggal mudah, caranya manfaatkan indexing

 contoh
 fun main() {
    val text = "Kotlin"
    val firstChar = text [0]

    print("First character of $text is $firstChar")

}

 Indexing merupakan sebuah cara yang memudahkan kita untuk
 mengakses elemen yang berada di dalam sebuah Collection
 dengan memanfaatkan index atau posisi dari elemen tersebut
 Posisi dari sebuah elemen pada umumnya dimulai dari angka 0

 */

/* Escaped String

   Escaped String yang memungkinkan kita untuk mengurangi ambiguitas
   nilai yang berada di dalam sebuah String.

   contoh
   val statement = "kotlin is \"Awesome!\""

   beberapa karakter yang dapat digunakan untuk escaped di dalam string:
   \t: menambah tab ke dalam teks.

   \n: membuat baris baru di dalam teks.

   \’: menambah karakter single quote kedalam teks.

   \”: menambah karakter double quote kedalam teks.

   \\: menambah karakter backslash kedalam teks.

   kita juga bisa menambahkan unicode ke dalam string

   contoh

   fun main() {
    val name = "Unicode test : \u00A9"
    print(name)
}
 */

/* Raw String
   berfungsi untuk menuliskan multiline dan arbitrary text.

   contoh

 */

fun main() {
    val line = """
        line 1
        line 2 
        line 3
    """.trimIndent()

    print(line)
}



