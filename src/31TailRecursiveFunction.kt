/*
Permasalahan ini di bahasa pemrograman Java tidak bisa ditangani
Namun di Kotlin, masalah ini ada solusinya, yaitu dengan menggunakan
tail recursive function
Tail recursive function adalah teknik mengubah recursive function yang kita buat,
menjadi looping biasa ketika dijalankan
Tidak semua recursive function bisa secara otomatis dibuat menjadi tail recursive function, ada syarat-syarat nya
*/


/*Tambahkan tailrec di functionnya
Saat memanggil function dirinya sendiri, hanya boleh memanggil function
dirinya sendiri, tanpa embel-embel operasi dengan data lain
*/

fun main() {
    tailrec fun display(value: Int){
        // tailrec mengubah recursive menjadi loop biasa
        // kecerdasan kotlin semata
        println("Recursive $value")
        if(value > 0){
            display(value -1)
        }
    }

    tailrec fun factorialLoop(value: Int, total: Int =1): Int{
        return  when (value){
            1 -> total
            else -> factorialLoop(value-1, total * value)
        }
    }

//    display(10000)
    println(factorialLoop(12))
}