import java.util.*

class New() {
    companion object {
        @JvmStatic

        // user input
        fun main(args: Array<String>) {
            var array = arrayOf("batu", "gunting", "kertas")

            // intro

            println("===== MAIN SUIT =====")
            println("Batu, Gunting, Kertas")
            println("=====================")
            // Pemain 1
            // bikin loop
            var i = 0
            do {


                println("Pemain 1 pilih apa?")
                var pemainPertama = readLine()!!.toLowerCase()
                if (!array.contains(pemainPertama)) {
                    do {
                        println("Formatnya salah cuy. Pilih Batu, Gunting atau Kertas")
                        pemainPertama = readLine()!!.toLowerCase()
                    } while (!array.contains(pemainPertama))
                }

                // Pemain 2
                println("Yuk, Pemain 2?")
                var pemainKedua = readLine()!!.toLowerCase()
                if (!array.contains(pemainKedua)) {
                    do {
                        println("Yah, salah format. Pilih Batu, Gunting atau Kertas")
                        pemainKedua = readLine()!!.toLowerCase()
                    } while (!array.contains(pemainKedua))
                }

                val mekanik1 = mekanik()
                mekanik1.cetakMekanik(pemainPertama, pemainKedua)
                println(if (i <2 )"Lanjut" else "Selasai")
                i++
            } while (i <3)
        }
    }
}