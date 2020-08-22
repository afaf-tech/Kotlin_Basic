//Seperti yang sudah dibahas sebelumnya, bahwa function itu bisa mengembalikan data
//Untuk memberitahu bahwa function mengembalikan data, kita harus menuliskan tipe data kembalian dari function tersebut
//Jika function tersebut kita deklarasikan dengan tipe data pengembalian, maka wajib di dalam function nya kita harus mengembalikan data
//Untuk mengembalikan data dari function, kita bisa menggunakan kata kunci return, diikuti dengan datanya

fun jumlahkan(a: Int, b:Int): Int{
    val total = a + b
    return  total
}

fun main() {
    println(jumlahkan(100, 200))
}