fun main(){
    var numb : Float = 100.3F;
    var sampel : Long = 100L;
    println(numb);


    var binary : Int = 0b0001010101;
    println(binary);
    // underscore in variable number
    var age : Byte = 3_0
    println(age)

    var price : Long = 9000_000_000L
    println(price);

    // conversion
    var priceInt : Int = price.toInt() // will be overflow due to maximum size of Int type
    println(priceInt)

    var doubleBinary : Double = binary.toDouble()
    println(doubleBinary)
}