package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    val namaDepan : String = "Dian"
    val namaBelakang : String = "Maharani"
    val umur : Int = 21
    val status : Boolean = true

    println("+-----------------------------------+")
    println("               PROFIL                ")
    println("""
        | Nama depan    : $namaDepan
        | Nama belakang : $namaBelakang
        | Nama Lengkap  : $namaDepan Putri $namaBelakang 
        | Umur          : $umur
        | Status        : single ($status)
    """.trimMargin())
    println("+-----------------------------------+")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    println("Group        : $groupId")
    println("Anggota Grup : $groupMember")
    println("Sesi         : $session")

    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {
    val anggota = mutableListOf<String>(
        "Aulia Suci Mareta (Mobile)",
        "Delima Chrismas Sembiring (Mobile)",
        "Annisa Laila Rahmawati (Mobile)",
        "Dian Putri Maharani (Mobile)",
        "Kanro (Mobile)",
        "Gusracita Rubiaty Pratiwi (Web)",
        "Fitrohul Khasanah (Web)",
        "Nurul Farada Purba (Web)",
        "Farhan Abdurrahman Zain (Web)",
        "Naufal Zaul Karim (Web)")

    val saya = anggota[3]
    return saya
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val countOfGroup = 5


    val totalMentor = mentor.size
    val total = totalMentor + countOfGroup

    return total

}

fun main() {

    myProfile()

    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    println()
    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(1,
                listOf("\nAulia Suci Mareta (Mobile)",
                        "\nDelima Chrismas Sembiring (Mobile)",
                        "\nAnnisa Laila Rahmawati (Mobile)",
                        "\nDian Putri Maharani (Mobile)",
                        "\nKanro (Mobile)",
                        "\nGusracita Rubiaty Pratiwi (Web)",
                        "\nFitrohul Khasanah (Web)",
                        "\nNurul Farada Purba (Web)",
                        "\nFarhan Abdurrahman Zain (Web)",
                        "\nNaufal Zaul Karim (Web)"),
                "Afternoon")

}