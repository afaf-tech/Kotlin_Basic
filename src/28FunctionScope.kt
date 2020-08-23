/*
Function scope adalah ruang lingkup dimana sebuah function bisa diakses
Saat kita membuat function di dalam file kotlin, maka secara otomatis function tersebut bisa diakses dari file kotlin manapun
Jika kita ingin membatasi misalnya sebuah function hanya bisa diakses dalam function tertentu, maka kita bisa membuat function di dalam function
*/


fun satu(){
    println("satu")
}
fun dua(){
    println("dua")

}

fun main() {
    fun helloCountry(country: String){
        satu()
        dua()
        println("Hello $country ku")
    }

    helloCountry("Indonesia")
}

