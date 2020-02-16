class Suit() {
    fun cetakSuit(pemainPertama: String?, pemainKedua: String?) {
        if ((pemainPertama.equals("batu") && pemainKedua.equals("gunting")) ||
            (pemainPertama.equals("gunting") && pemainKedua.equals("kertas")) ||
            (pemainPertama.equals("kertas") && pemainKedua.equals("batu"))
        )
            println("Pemain Pertama MENANG!")
        else if ((pemainPertama.equals("batu") && pemainKedua.equals("kertas")) ||
            (pemainPertama.equals("gunting") && pemainKedua.equals("batu")) ||
            (pemainPertama.equals("kertas") && pemainKedua.equals("gunting"))
        )
            println("Pemain Kedua MENANG!")
        else if (pemainPertama.equals(pemainKedua))
            println("SERI!")
    }
}