/*
 * Copyright (c) 2021. Silahkan di copy paste guys
 * Kalau ada yg mau di tanya silahkan di chat via Group WA / request di Github
 * Sekalian follow di instagram @riowiraawan
 */

/*
    Pertemuan Keempat (Function)

    a. Function Tanpa Pengembalian Nilai

    fun nama_function (variable : tipe_data) {
        statement
    }

    cth :
    tanpa parameter

    fun menampilkanHello () {
        println("Hello World")
        println("Hello World")
        println("Hello World")
        println("Hello World")
        println("Hello World")
    }

    dengan parameter

    fun menampilkanHello2 (nama : String) {
        println("Hello ${nama}")
    }

    fun penjumlahan (bilanganPertama : Int, bilanganKedua : Int){
        println("Penjumlahan : ${bilanganPertama+bilanganKedua}")
    }

    pemanggilan function

    menampilakanHello ()
    Output: Hello World Sebanyak 5 kali

    menampilakanHello2 ("Rio")
    Output: Hello Rio

    penjumlahan (10, 11)
    Output: Penjumlahan : 21

    b. Function Dengan Pengembalian Nilai

    fun nama_function (variable : tibe_data) : tipe_data {
        return variable
    }

    cth :

    tanpa parameter

    fun menampilkanHellow () : String {
        return "Hello World"
    }

    dengan parameter

    fun menampilkanHellow2 (nama : String) : String {
        return "Hello $nama"
    }

    fun penjumlahan2 (bilanganPertama : Int, bilanganKedua : Int) : String {
        return (bilanganPertama + bilanganKedua).toString()
    }

    pemanggilan function

    println(menampilkanHellow ())
    Output : Hello World

    println(menampilkanHellow2 ("Rio"))
    Output : Hello Rio

    println(penjumlahan2(10, 11))
    Output : 21

 */

package pertemuan4

//function dapat dibuat diluar fucntion pertemuanpertama.pertemuankedua.main
fun menampilkanHello (){
    println("Hello World")
}

fun menampilkanHello2 (nama: String) {
    println("Hello $nama")
}

fun main(){
    //pemanggilan function
    menampilkanHello()
    menampilkanHello2("Rio")

    //function juga dapat di buat di dalam function pertemuanpertama.pertemuankedua.main
    fun penjumlahan(bilanganPertama : Int, bilanganKedua : Int) {
        println("Penjumlahan : ${bilanganPertama+bilanganKedua}")
    }

    penjumlahan(10, 11)

    println(menampilkanHellow())

    //hasil dari fucntion dapat disimpan di dalam variable
    val text = menampilkanHellow2("Rio")
    println(text)

    val penjumlahan = penjumlahan2(10, 11)
    println(penjumlahan)
}

fun menampilkanHellow () : String = "Hello World"
//NB : jika statement hanya 1 baris, return boleh tidak diketik, { return } dapat diganti dengan =

fun menampilkanHellow2 (nama: String) = "Hello $nama"
//NB : tipe pengembalian function bisa tidak di ketik jika statement hanya 1 baris

fun penjumlahan2(bilanganPertama: Int, bilanganKedua: Int) = (bilanganPertama+bilanganKedua).toString()

