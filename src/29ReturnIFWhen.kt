/*
Kadang salam sebuah function, kita sering menggunakan If expression atau when expression,
 lalu di dalam blok nya kita mengembalikan nilai untuk sebuah function
Kotlin mendukung return if atau when, dimana fitur ini bisa mempermudah kita ketika ingin
 mengembalikan nilai dalam if atau when
*/


fun main() {
    fun sayHai(name:String = ""):String{
//        return if(name==""){
//            "zero empty"
//        }else{
//             "Halo $name"
//        }
        return  when(name){
            ""-> "zero empty"
            else -> "Hello $name"
        }
    }

    println(sayHai("nola maleke"))

}
