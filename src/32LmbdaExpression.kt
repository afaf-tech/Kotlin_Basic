fun toUpper(value:String) = value.toUpperCase()

fun main() {


    val contohlambdaL: (String, String) -> String  = {firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohlambdaL("Fatih", "Al Fikri")
    println(result)

    val sayHely: (String)-> String= {
        "Hello ${it.toUpperCase()}"
    }

    println(sayHely("Ais"))

    // method reference
    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Fatih Al Fikri"))
}