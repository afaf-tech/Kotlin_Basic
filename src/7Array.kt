fun main() {
    // array di kotlin hanya bisa menampung data dengan tipedata yg sama
    // direpresentasikan dengan keyeord array
    // array itu tidak dinamis ; ukurannya mutlak

    val names : Array<String> = arrayOf("Eko", "Joko", "Budi")
    names.set(0, "Nano") // jika hanya mengubah isi array itu tidak masalah
    println(names[0])

    val nilai : Array<Int> = arrayOf(1,4,6,34,6464,2,3232)

    println(nilai)


    // Array Nullable
    val names2 : Array<Int?> = arrayOfNulls(20)
    names2[0] = 31232
    names2[2] = null
    println(names2[0])
    println(names2.size)

}