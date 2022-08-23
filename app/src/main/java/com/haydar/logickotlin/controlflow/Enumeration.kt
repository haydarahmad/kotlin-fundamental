package com.haydar.logickotlin.controlflow

import android.graphics.Color

/* Enumeration
   merupakan salah fitur yang bisa digunkan untuk menyimpan
   kumpulan objek yang telah didefinisikan menjadi tipe
   data konstanta

   dan juga bisa untuk meminimalisir kesalahan pengetikan
   dalam sebuah variable

   contohnya
fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

 untuk mendefinisikan sebuah class Enum, kita menggunakan kata kunci enum
 dan setiap objeknya dipisahkan menggunakan koma
 berikut adalah contoh paling mendasar dari sebuah kelas enum

enum class Color{
    RED,GREEN,BLUE
}

 konsep Enum hampir mirip dengan array bedanya enum itu constant

 berikut contoh ketika mengakses objek yang berada di enum

 fun main() {
    val color : Color = Color.RED
    print(color)
}

enum class Color{
    RED,GREEN,BLUE
}

 kita juga bisa mendeklarasikan anonymous class untuk setiap
 objek Enum

 contohnya

 enum class Color(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

Setiap enum class memiliki sebuah synthetic method yang memungkinkan
kita mendapatkan daftar objek Enum dan nama dari tiap Enum itu sendiri

contohnya
 fun main() {
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print("$color ")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}


Untuk mendapatkan daftar objek Enum kita bisa menggunakan fungsi values().
Sedangkan untuk mendapatkan nama dari objek Enum kita bisa menggunakan
fungsi valueOf() seperti berikut

contohnya
fun main() {
    val color: Color = Color.valueOf("RED")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

Konsep dari Enumeration sendiri sama seperti Array. Oleh karena itu,
selain mendapatkan daftar dan nama dari tiap objek Enum, kita juga bisa
mendapatkan posisi tiap objek menggunakan properti ordinal seperti berikut

contohnya
fun main() {
    val colors: Array<Color> = enumValues()
    colors.forEach {color ->
        println(color)
    }

    val color: Color = enumValueOf("RED")
    println("Color is $color")
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

 */












