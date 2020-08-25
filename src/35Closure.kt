/* Closure : Kemampuan sebauh function, lambda atau anonyous function
* berinteraksi dengan data-data disekitarnya dalam scope yg sama
* Harap gunakan fitur ini dengan bijak
* */
fun main() {
    var counter: Int =0

    val lambdaIncrement ={
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrement = fun(){
        println("Anonymous Function Increment")
        counter++
    }

    fun functionIncrement(){
        println("Function Incremenet")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

}