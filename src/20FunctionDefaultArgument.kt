fun hello(firstName:String, lastName:String? = ""){
    println("Hello $firstName $lastName")
}
fun main() {
    hello("Fatih")
    hello("Fatih", "Al Fikri")
}