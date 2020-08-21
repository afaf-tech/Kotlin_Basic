fun main() {
    val nilai ="b"

    when (nilai){
        "a" -> println("Amazing")
        "b" -> println("Bad")
        "g" -> println("Good")
        else -> {
            println("try again next month!")
        }
    }

    val nilai2 = "A"
    when(nilai2){
        // multiple options  (if (nilai="A"|| ........
        "A", "B", "C" -> {
            println("lalulalang")
        }
    }

    val nilaiLulus : Array<String> = arrayOf("A", "B", "C")
    when(nilai2){
        // in Array
        in nilaiLulus -> println("Selamat Anda Lulus")
        !in nilaiLulus -> println("MAAF, Anda Tidak Lulus")
    }

    val name ="Fikri"
    when(name){
        is String -> println("$name is String")
        !is String -> println("$name is not String")
    }


    // When tanpa tanda variable sebagai penggant if else
    val nilaiUjian = 90
    when{
        nilaiUjian > 90 -> println("Amax=zing")
        nilaiUjian > 80 -> println("Good Job")
        else -> print("heheh")
    }
}