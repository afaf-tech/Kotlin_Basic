fun main() {
    var firstname : String = "Eko"
    var lastname : String = "Khannedy"

    var address : String = """
       | Jalan Belum Jadi, RT 01 RW 01
       | Kabupaten Subang
       | Jawa barat
       | Indonesia
    """.trimMargin()
    var address2 : String = """
       > Jalan Belum Jadi, RT 01 RW 01
       > Kabupaten Subang
       > Jawa barat
       > Indonesia
    """.trimMargin(">")

    println(firstname)
    println(lastname)
    println(address)
    println(address2)
    println("===================")
    var fullname : String = firstname + lastname;
    println(fullname);

//    String Template = kemampuan mengakses data external melalui stringnya
    var desc : String = "total $fullname char = ${fullname.length}"
    println(desc)
}