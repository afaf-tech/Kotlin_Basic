fun main() {
    // For digunakan untuk melakukan perulangan iterasi dari data iterator (Array, Range, dan lain lain)

    var array = arrayOf("Fikri", "Fatih", "Al")

    var total = 0
    // for in array
    for (name in array){
        println(name)
        total++
        println(total)
    }


//    for range

    for(i in 100 downTo 0 step 5){
        println(i)
    }

    // perulangan kombinasi range dan array
    val ukuranArray = array.size -1
    for (i in 0..ukuranArray){ // seperti for param length
        println("Index $i = ${array.get(i)}")
    }

}