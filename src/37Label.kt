fun labelBreak(): Unit{
    loopI@for (i in 1..10){
        loopJ@for(j in 1..10){
            if(j > 5){
                break@loopI
            }
            println("$i * $j = ${i * j}");
        }
    }
}
fun labelContinue():Unit{
    loopI@for (i in 1..10){
        loopJ@for(j in 1..10){
            if(j==5){
                continue@loopI
            }
            println("$i * $j = ${i * j}");
        }
    }
}
fun main() {
    fun test(name:String, param: (String)-> Unit): Unit = param(name)
    test("")test@{
        if(it==""){
            return@test
        }else{
            println("Eko")
        }
    }
}