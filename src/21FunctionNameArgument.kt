//Kadang ada function yang parameternya banyak sekali
//Hal ini sangat menyulitkan saat kita akan memanggil function tersebut, kita harus benar-benar tahu urutan parameter di function tersebut
//Untungnya kotlin memiliki fitur yang namanya Named Argument
//Named Argument adalah fitur dimana kita bisa menyebutkan nama parameter saat memanggil function, dengan demikian kita tidak wajib tahu posisi tiap parameter

// Fitur ini tidak ada di Java
fun fullName(
        firstNamee: String,
        middleName: String,
        lastName: String
){
    println("$firstNamee $middleName $lastName")

}
fun main() {
    fullName("Fatih", "Al", "Fikri")
    fullName(lastName = "Fikri", firstNamee = "fatih", middleName = "Al")
}