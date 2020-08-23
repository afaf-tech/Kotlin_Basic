/*
Recursive function adalah function yang memanggil function dirinya sendiri
Kadang dalam pekerjaan, kita sering menemui kasus dimana menggunakan recursive function
lebih mudah dibandingkan tidak menggunakan recursive function
Contoh kasus yang lebih mudah diselesaikan menggunakan recursive adalah Factorial
*/


fun main() {
    fun factorialLoop(value: Int): Int{
        var result = 1
        // using for loop
        /*for (i in value downTo 1){
            result *= i
        }*/
//        return result

//        using recursivefunction
        return  when (value){
            1 -> 1
            else ->value * factorialLoop(value-1)
        }
    }

    println(factorialLoop(10))
}