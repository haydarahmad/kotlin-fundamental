package com.haydar.logickotlin.kotlinfundamental

/* null pointer expection
    sebuah kesalahan yang terjadi saat ingin mengakses
    atau mengelola nilai dari sebuah variabel yang belum
    diinisialisasi atau variabel yang bernilai null.

    Kotlin mampu membedakan objek yang boleh bernilai null
    dan objek yang tidak boleh bernilai null pada saat
    objek tersebut dibuat.

    tetapi kotlin memaksa kita untuk menentukan nilai awal dari
    sebuah objek ketika dibuat dan tidak boleh bernilai null.

    jika ingin object tetap null kita harus tambahkan tanda (?)
    setalah menentukan tipe object tersebut

    val text : String? = null

    namun kita tidak bisa langsung mengakses atau mengelola
    nilai dari object yang sudah ditandai nullable
    kita harus mengecek kondisinya null atau tidak
    dengan mengunakan (if else)

    contohnya

    fun main() {
    val text: String? = null

    if (text != null){
        val textLength = text.length
    }
}


 */





