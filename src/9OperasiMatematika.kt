fun main() {
    // pembagian di Kotlin jangan menggunakan Integer jika membutuhkan koma
    var result = 10.0/3.0

    println(result)

    val result2 = 10 + 10 / 2
    println(result2)


    // Augmented Assigment
    var total = 0

    val barang1 = 100
    total += barang1
    val barang2 = 200
    total += barang2
    val barang3 = 300
    total += barang3

    println(total)


    // Unary Operator
    total++
    println(total)


    var suhu = -5
    suhu--
    println(suhu)


}