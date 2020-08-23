fun main() {

    fun hihi(name:String, transformer: (String)-> String): String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lamdaUpper = { value : String -> value.toUpperCase()}

    println(hihi("Fikri", lamdaUpper))
    println(hihi("Adam") { value: String -> value.toLowerCase() })


//    traiing lambda
    val result2 = hihi("Akmal") {value:String ->
        value.toLowerCase()
    }
    println(result2)

}