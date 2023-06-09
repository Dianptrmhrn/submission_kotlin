package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    val buah = listOf<String>("Apel", "Anggur")
    try{
        println(buah[3])
    }catch (error: ArrayIndexOutOfBoundsException){
        println("Terjadi Error ${error.message}")
    }


}