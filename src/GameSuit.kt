import java.util.*

class New() {
    companion object {
        @JvmStatic
        // user input
        fun main(args: Array<String>) {
            println("Masukkan Pemain 1")
            val pemainPertama = readLine()
            println("Masukkan Pemain 2")
            val pemainKedua = readLine()

            // if
            if ((pemainPertama.equals("batu") && pemainKedua.equals("gunting")) ||
                    (pemainPertama.equals("gunting") && pemainKedua.equals("kertas")) ||
                    (pemainPertama.equals("kertas") && pemainKedua.equals("batu")))
            println("Pemain Pertama MENANG!")
            if ((pemainPertama.equals("batu") && pemainKedua.equals("kertas")) ||
                    (pemainPertama.equals("gunting") && pemainKedua.equals("batu")) ||
                    (pemainPertama.equals("kertas") && pemainKedua.equals("gunting")))
            println("Pemain Kedua MENANG!")
            if ((pemainPertama.equals("batu") && pemainKedua.equals("batu")) ||
                    (pemainPertama.equals("gunting") && pemainKedua.equals("gunting")) ||
                    (pemainPertama.equals("kertas") && pemainKedua.equals("kertas")))
            println("DRAW!")
        }
    }
}
