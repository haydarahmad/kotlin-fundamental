package com.haydar.logickotlin.kotlinfundamental

/* function
   Function atau fungsi merupakan sebuah prosedur
   yang memiliki keterkaitan dengan pesan dan objek

   implementasinya :
   fun functionName (param1: Type1,param2: Type2 ...): ReturnType{
   return result
   }

   contohnya
   fun setUser(name: String, age: Int):String{
    return "your name is $name,and your $age years old"
}
   tetapi jika nilai kembaliannya hanya satu kita
   bisa lansung menuliskannya menggunakan (=) sama dengan

   contohnya
   fun setUser(name: String, age: Int): String = "Your name is $name,and you $age years old"

   Dengan expression body, kompiler dapat menentukan tipe kembalian dari fungsi yang dibuat
   jadi tidak perlu lagi menuliskan (String)

   jika tidak ingin fungsi mengembalikan nilai kita bisa pakai Unit

   contohnya
   fun printUser(name: String) : Unit {
    print("your name $name")
}

 Ketika menggunakan tipe kembalian Unit, Kotlin memungkinkan kita untuk menghilangkannya
 Kompiler akan mendeteksinya sebagai tipe kembalian yang redundant

 contohnya
 fun printUser(name: String){
    print("Your name is $name")
 }

 */
fun main() {
    val user = setUser("Alfian",19)
    print(user)

    printUser("Alfian")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name:String){
    println("Your name is $name")
}







