fun main() {

    fun hihi(name:String, transformer: (String)-> String): String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // anonymous function
    val upper = fun(value:String):String{
        if(value==""){
            return "UPS"
        }else{
            return value.toUpperCase()
        }
    }
    println(hihi("SuparnoAlpin",upper) )

    print(hihi("FikriLuv", fun(value:String):String{
        return value.toLowerCase()
    }))

}