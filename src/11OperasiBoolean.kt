fun main() {
    // digunakan untuk menggabungkan dua nilai boolean
    //      &&    ||    !

    val nilaiUjian = 80
    val nilaiAbsen = 90
    val nilaiExtra = 40

    val apakahLulusUjian = nilaiUjian >75
    val apakahLulusAbsen = nilaiAbsen > 76
    val apakahLulusExtra = nilaiExtra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra
    println(apakahLulus)
}