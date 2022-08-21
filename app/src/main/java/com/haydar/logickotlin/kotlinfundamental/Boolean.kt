package com.haydar.logickotlin.kotlinfundamental

/* conjunction atau and
   operator and akan true jika semua hasilnya true

   contohnya
   fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else{
        false
    }

    print("office is open : $isOpen")
}

 kode diatas bisa kita sederhanakan jadi seperti ini

 fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed

    print("office is open : $isOpen")

}
 */

/* Disjunction atau OR
   operator or akan true jika hasil salah satunya true

  contohnya
fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isClose = now < officeOpen || now > officeClosed

    print("office is closed : $isClose")
}


 */

/* Negation atau Not
   Berbeda dengan operator AND (&&) dan operator OR(||),
   operator NOT(!) digunakan untuk melakukan negasi pada
   hasil evaluasi expression yang diberikan. Contoh, Jika hasil
   expressions setelah dievaluasi bernilai true, maka operator NOT
   akan mengembalikan nilai false.


 */

fun main() {
    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else{
        print("office is open")
    }
}





