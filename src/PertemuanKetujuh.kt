/*
 * Copyright (c) 2020. Silahkan di copy paste guys
 * Kalau ada yg mau di tanya silahkan di chat via Group WA / request di Github
 * Sekalian follow di instagram @riowiraawan
 */

/*
    Pertemuan Keenam (Inheritance)



 */

open class TransportasiDarat (val platNomor : String? = null, val merk : String? = null) : DriverOnSeat{
    override fun onStart() {
        println("Kendaraan Di start")
    }

    override fun onOpenBaggage() {
        println("Kendaraan Buka Bagasi")
    }

    open fun belokKanan() = println("Kendaraan Berbelok Kekanan")

    fun belokKiri() = println("Kendaraan Berbelok Kekiri")
}

class Kereta(platNomor: String, merk: String) : TransportasiDarat(platNomor, merk) {

    fun sliding() = println("Kereta Ngeslide")

    override fun belokKanan() {
        println("Kereta Berbelok Kekanan")
        super.belokKanan()
    }

}

interface DriverOnSeat {
    fun onStart()
    fun onOpenBaggage()
}

fun main(){
    val kereta = Kereta("BK 1 LT", "Toyota")
    kereta.sliding()
    kereta.belokKanan()
    kereta.belokKiri()
    kereta.onStart()
    kereta.onOpenBaggage()
    println(kereta.merk)
    println(kereta.platNomor)
}