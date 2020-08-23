//Infix Notation adalah operasi yang biasa dilakukan di operasi matematika, dimana dia melakukan operasi terhadap dua data
//Hampir semua operasi matematika adalah infix notation
//Di kotlin, kita bisa membuat function infix notation juga
//Untuk menggunakan function infix notation, tidak wajib menggunakan tanda . (titik)
//Syarat
    //Harus sebagai function member (akan dibahas di OOP) atau function extension
    //Harus memiliki 1 parameter
    //Parameter tidak boleh varargs dan tidak boleh memiliki nilai default

infix fun String.to(type: String): String{
    if(type=="UP"){
        return  this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}
fun main() {
    val result = "Ahmad Fatih Al Fikri" to "LO"
    println(result)

    1000 downTo 1 // is one of infix notations
}