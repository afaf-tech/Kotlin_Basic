const val APP = "Belajar Kotlin Dasar"
const val VERSION = "2.0.2"
fun main() {
    // Variable adalah tempat untuk menyimpan data
    // di KOTLIn ada dua mutable dan immutable
    //    maksud dari mutable datanya bisa berubah sedangkan tipenya tidak
    //    immutable data dan tipe tidak dapat dirubah
    //    direkomendasikan mengguanakan variable immutable karena lebih secure

    val firstname : String = "Eko"
    val age = 30

    println(firstname)
    println(age)


    // cara membuat variable null  = Nullable
    val cobanull : String? = null

    // error karena cobanull bisa null
//    println(cobanull.length)
    println(cobanull?.length) // if cobanull is not null , try to access the length


    // Variable Constant
    // adalah immutable data yg bisa diakses untuk keperluan global
    // untuk menandai bahwasanya variable tersebut adalah constant maka menggunakan UPPER_CASE
    // wajib menggunakan val

    println("Ini App $APP dengan versi $VERSION")




}