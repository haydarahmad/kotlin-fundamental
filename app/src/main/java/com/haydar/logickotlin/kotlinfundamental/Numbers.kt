package com.haydar.logickotlin.kotlinfundamental

/* Number

 Int (32 Bit)
Int adalah tipe data yang umumnya digunakan untuk menyimpan nilai numerik.
Int dapat menyimpan data dari range -2^31 sampai +2^31-1. Dengan ukuran 32 Bit
kita bisa menggunakannya untuk menyimpan nilai yang besar.

contohnya
val intNumber = 100


 Long (64 Bit)
 Long adalah tipe data yang digunakan untuk menyimpan nilai numerik
 yang lebih besar yaitu dari range -2^63 sampai +2^63-1.

 contohnya
 val longNumber: Long = 100

 tetapi kita bisa definisikan long secara eksplisit dengan cara
 menambahkan suffix (L)

 contohnya
 val longNumber = 100L


 Short (16 Bit)
  Short merupakan sebuah bilangan bulat yang hanya dapat menyimpan
  nilai yang kecil karena hanya berukuran 16 Bit.

  contohnya
  val shortNumber: Short = 10


 Byte (8 Bit)
  Dengan ukuran yang kecil, Byte hanya mampu menyimpan nilai yang kecil sama halnya seperti Short
  Byte biasa digunakan untuk keperluan proses membaca dan menulis data dari sebuah stream file atau jaringan

  contohnya
  val byteNumber = 0b11010010


 Double (64 Bit)
   Sama halnya dengan Long yang memiliki ukuran yang besar, Double mampu
   menyimpan nilai numerik yang besar pula. Pada umumnya
   Double digunakan untuk menyimpan nilai numerik pecahan sampai
   dengan maksimal 15-16 angka di belakang koma.

   contohnya
   val doubleNumber: Double = 1.3


 Float (32 Bit)
   Sama seperti Double, namun memiliki ukuran yang lebih kecil,
   yakni hanya sampai 6-7 angka di belakang koma.

   contohnya
   val floatNumber: Float = 0.123456789f


  untuk mengetahui nilai maksimal yang dapat disimpan oleh suatu
  tipe number kita bisa mengunakan properti (MAX_VALUE)

  Sementara untuk mengetahui nilai minimal yang dapat disimpan,
  gunakan properti (MIN_VALUE)

  contohnya
  fun main() {
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)
}


  Terdapat beberapa operator matematika pada tipe data Number seperti penjumlahan (+),
  pengurangan (-), perkalian (*) , pembagian (/) dan modulus (%, atau sisa hasil bagi).

  contohnya
  fun main() {
    val numberOne = 1
    val numberTwo = 2

    print(numberOne + numberTwo)
}


  Perlu diketahui, hasil operasi pembagian pada tipe data Int akan dibulatkan kebawah.

  contohnya
  fun main() {
    val numberOne : Int = 27
    val numberTwo : Int = 10

    print(numberOne / numberTwo)

}


  Di Kotlin kita tidak bisa melakukan konversi secara langsung
  kita harus tambahkan ( toInt() )

  jika tidak menambahkan toInt() akan ada error seperti berikut:
  Error:(4, 18) Kotlin: Type mismatch: inferred type is Byte but Int was expected

  contohnya
  fun main() {
    val byteNumber : Byte = 10
    val intNumber : Int = byteNumber.toInt()
}


  Kode di atas menggunakan fungsi toInt() untuk melakukan konversi secara eksplisit
  dari tipe data Byte ke tipe data Int. Adapun beberapa fungsi konversi yang
  dapat kita gunakan antara lain:

  toByte(): Byte

  toShort(): Short

  toInt(): Int

  toLong(): Long

  toFloat(): Float

  toDouble(): Double

  toChar(): Char


  contoh lain penggunaan konversi adalah sebagai berikut:
  fun main() {
    val stringNumber = "23"
    val intNumber = 3

    print(intNumber + stringNumber.toInt())
}


   Dengan Kotlin kita juga bisa menuliskan nilai numerik yang
   “readable” dengan menggunakan tanda underscores seperti berikut:

fun main() {
    val readableNumber = 1_000_000
    print(readableNumber)
}
 */
































