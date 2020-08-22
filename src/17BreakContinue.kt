fun main() {
    // Break & Continue adalah kata kunci yg bisa digunakan dalam semua perulangan di Kotlin
    // "Break" digunakan untuk menghentikan seluruh perulangan
    // "Continue" adalah digunakan untuk menghentikan perulangan yg berjalan dan langsung melanjutkan
    //          ke perulangn selanjutnya

    var i =0
    while (true){
        println("Hello ke $i" )
        i++

        if(i> 10){
            break
        }
    }


    for (i in 1..1000){
        if(i % 5 !=0){
            continue;
        }
        println("Perlungan ke $i")
    }

}