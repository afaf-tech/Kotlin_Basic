/* Didalam java tidak ada istilah functional progamming */

/*Menggunakan Higher-Order Function adalah salah satu fitur yang sangat berguna.
* Namun penggunaan Higher-Order Function akan berdampak terhadap performa saat aplikasi berjalan,
*  karena harus membuat object lambda berulang-ulang. Jika penggunaannya tidak terlalu banyak ,
* mungkin tidak akan terasa, tapi jika banyak sekali, maka akan terasa impact nya
* Inline Functions adalah """ kemampuan di Kotlin yang mengubah Higher-Order Function menjadi
* Inline Function"""
* Dimana dengan Inline Function, code di dalam Higher-Order Function akan di duplicate agar pada saat runtime, aplikasi tidak perlu membuat object lambda berulang-ulang
*/

 inline fun heloa(name: () ->String): String{
    return  "Hello ${name()}"
}

inline fun haloanoInline(firsname: () ->String, noinline lastname: ()-> String): String{
    return  "Hello ${firsname()} ${lastname()}"
}

fun main() {
    for (i in 0..100){
        println(heloa { "Fatih" })
        // jika tanpa inline maka diaa akan membuat 100 object inline yg memperberat system
    }

    println(haloanoInline({ "Fikri"},{"Farid"}))
}