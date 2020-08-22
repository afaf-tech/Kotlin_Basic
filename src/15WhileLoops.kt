fun main() {
    // While perulangan yg sangat flexible, dimana kode while akan melakukan pengecekan kondisi
    // jika true maka dia akan menjalankan blok while. dan terus diulang sampai kondisi false

    var i = 0
    while (i < 1_000_000){
        println("Perulangan $i")
        i++
    }


    println("Selesai Perulangan")
}