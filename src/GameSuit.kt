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
            // if
            if ((pemainPertama.equals("batu") && pemainKedua.equals("gunting")) ||
                (pemainPertama.equals("gunting") && pemainKedua.equals("kertas")) ||
                (pemainPertama.equals("kertas") && pemainKedua.equals("batu"))
            )
                println("Pemain Pertama MENANG!")
            if ((pemainPertama.equals("batu") && pemainKedua.equals("kertas")) ||
                (pemainPertama.equals("gunting") && pemainKedua.equals("batu")) ||
                (pemainPertama.equals("kertas") && pemainKedua.equals("gunting"))
            )
                println("Pemain Kedua MENANG!")
            if ((pemainPertama.equals("batu") && pemainKedua.equals("batu")) ||
                    (pemainPertama.equals("gunting") && pemainKedua.equals("gunting")) ||
                    (pemainPertama.equals("kertas") && pemainKedua.equals("kertas"))
                    )
            println("DRAW!")
        }
    }
}
