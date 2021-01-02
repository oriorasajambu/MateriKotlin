/*
 * Copyright (c) 2021. Silahkan di copy paste guys
 * Kalau ada yg mau di tanya silahkan di chat via Group WA / request di Github
 * Sekalian follow di instagram @riowiraawan
 */

/*
    Pertemuan Keenam (Class)

    class nama_class {

        attribute

        constructor

        function (method)

    }
 */

package pertemuan6

class Mobil {
    var merkMobil: String? = null
    var kecepatanMax: Int? = null
    var warnaMobil: String? = null

    fun klakson(){
        println("Teloleeeet!")
    }
}

fun main(){

    val mobil = Mobil()
    mobil.merkMobil = "Toyota"
    mobil.kecepatanMax = 140
    mobil.warnaMobil = "Pink"

    println("Merk Mobil : ${mobil.merkMobil}")
    println("Kecepatan Mobil : ${mobil.kecepatanMax}")
    println("Warna Mobil : ${mobil.warnaMobil}")

    mobil.klakson()

    val pesawat = Pesawat("Garuda", "BOEING777", 1400)
    println("Maskapai : ${pesawat.maskapai}")
    println("Model : ${pesawat.model}")
    println("Max Altitude : ${pesawat.maxAltitude}")
    println(pesawat.landing())
}

class Pesawat (var maskapai: String, var model: String, var maxAltitude : Int) {
    fun landing() = "Pesawat Berhasil Landing"
}