import java.util.*

class New() {
    companion object {
        @JvmStatic

        // user input
        fun main(args: Array<String>) {
            var array = arrayOf("batu", "gunting", "kertas")

            // Pemain 1
            println("Masukkan Pemain 1")
            var pemainPertama = readLine()
            if (!array.contains(pemainPertama)) {
                do {
                    println("Formatnya salah cuy. Pilih batu, gunting atau kertas")
                    pemainPertama = readLine()
                } while (!array.contains(pemainPertama))

            }

            // Pemain 2
            println("Masukkan Pemain 2")
            var pemainKedua = readLine()
            if (!array.contains(pemainKedua)) {
                do {
                    println("Yah, salah format. Pilih batu, gunting atau kertas")
                    pemainKedua = readLine()
                } while (!array.contains(pemainKedua))

            }

            val mekanik1 = mekanik()
            mekanik1.cetakMekanik(pemainPertama, pemainKedua)
        }
    }
}
