package com.haydar.logickotlin.controlflow

/* While
 untuk menggunakan while kita butuh kata kunci while
 contohnya:
 fun main() {
    var a = 1
    while (a <= 7){
        println("Hello,World!")
        a++
    }
}

 jika kondisi tidak terpenuhi sejak awal maka proses
 pengulangan tidak terjadi
 contohnya:
 fun main() {
    var a = 8
    while (a <= 7){
        println("hello,world!")
        a++
    }
}
 */

/* Do While

Berbeda dengan While, Do While bersifat Exit Controlled Loop di mana
proses perulangan akan langsung dijalankan di awal. Jika telah selesai,
barulah kondisi yang diberikan akan dievaluasi.

contohnya:
fun main() {
    var b = 1
    do {
        println("hello,world!")
        b++
    } while (b <= 7)
}

 saat menggunakan while dan doWhile perhatikan
 infinite loop, dimana kondisi dimana proses
 perulangan terjadi secara terus menerus sampai aplikasi
 crash

 infinite loop terjadi jika kondisi true terus menerus


 contohnya:

 fun main() {
    var value = 'A'
    do {
        println(value)
    } while (value <= 'Z')
}

 */




