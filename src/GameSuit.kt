import java.util.*

class New() {
    companion object {
        @JvmStatic

        // user input
        fun main(args: Array<String>) {
            var array = arrayOf("batu", "gunting", "kertas")

            // IN
            println("===== MAIN SUIT =====")
            println("Batu, Gunting, Kertas")
            println("=====================")

            // Loop 3x
            var i = 0
            do {

                // Pemain 1
                println("Pemain Pertama pilih apa?")
                var pemainPertama = readLine()!!.toLowerCase()
                if (!array.contains(pemainPertama)) {
                    do {
                        println("Formatnya salah cuy. Pilih Batu, Gunting atau Kertas")
                        pemainPertama = readLine()!!.toLowerCase()
                    } while (!array.contains(pemainPertama))
                }

                // Pemain 2
                println("Yuk, Pemain Kedua?")
                var pemainKedua = readLine()!!.toLowerCase()
                if (!array.contains(pemainKedua)) {
                    do {
                        println("Yah, salah format. Pilih Batu, Gunting atau Kertas")
                        pemainKedua = readLine()!!.toLowerCase()
                    } while (!array.contains(pemainKedua))
                }

                // Panggilan
                val suit1 = Suit()
                suit1.cetakSuit(pemainPertama, pemainKedua)
                println(if (i < 2) "Lanjut ya..." else "Selasai, sampai jumpa.")
                i++
            } while (i < 3)
        }
    }
}