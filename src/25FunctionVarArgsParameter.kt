//Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan sebuah varargs
//Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array.
//Apa bedanya dengan parameter biasa dengan tipe data Array?
//Jika parameter tipe Array, kita wajib membuat array terlebih dahulu sebelum mengirimkan ke function
//JIka parameter menggunakan varargs, kita bisa langsung mengirim data nya, jika lebih dari satu, cukup gunakan tanda koma
// harus diposisi paling kanan
fun itungTotal(name: String, vararg values:Int): String {
    var total = 0

    for (value in values){
        total+=value
    }
    val con = total.toString()
    val str: String = "  $name $con"
    return  str
}
fun main() {
    val values = arrayOf(10,211,21)
    val result = itungTotal("Nola",21021)
    println("Jumlah seluruh array adalah $result")
}