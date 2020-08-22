fun sayHello(firstName: String, lastName:String?){
    if(lastName==null) {
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
}
fun main() {
    sayHello("Joko","Anwar")
    sayHello("Suparno", null)
    sayHello("Haji", "Sarkani")
}