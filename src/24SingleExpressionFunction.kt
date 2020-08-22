//Kadang kita sering membuat function yang sangat sederhana
//Misal function yang hanya berisikan kode blok sederhana, misal hanya 1 baris
//Jika kita mengalami hal seperti ini, kita bisa mengubahnya menjadi single expression function
//Single expression function adalah deklarasi function hanya dengan 1 baris kode
//Untuk membuat single expression function, kita hanya butuh tanda = (sama dengan) setelah deklarasi nama function dan tipe data pengembalian function

fun kaliDua(a: Int): Int = a * 2
fun sapa(name:String): Unit = println("HAlo $name")

fun main() {
    println(kaliDua(2222222))
    sapa("supaja")
}