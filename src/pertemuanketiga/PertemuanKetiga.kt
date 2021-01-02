/*
 * Copyright (c) 2021. Silahkan di copy paste guys
 * Kalau ada yg mau di tanya silahkan di chat via Group WA / request di Github
 * Sekalian follow di instagram @riowiraawan
 */

package pertemuanketiga

/*
    Pertemuan Ketiga (Struktur Perulangan / Looping)

    ===========================================================================

    1. FOR

    for (variable in range) {
        statement
    }

    cth :

    for (i in 1..10){
        println("hello")
    }

    output : Menampilkan "Hello" Sebanyak 10 kali

    ===========================================================================

    for (i in 1 until 10){
        println("Hello")
    }

    output : Menampilkam "Hello" Sebanyak 9 kali

    catatan : gunakan .. jika kita ingin range sampai dengan nilai akhir

    ===========================================================================

    for (i in 1 until 10 step 2){
        println(i)
    }

    output : Menampilkan Angka 1 - 9 Dengan Interval 2

    ===========================================================================

    for (i in 10 downTo 1) {
        println(i)
    }

    output : menampilkan Angka 10 - 1

    ===========================================================================

    2. WHILE

    while (kondisi){
        statement
    }

    cth :

    var bilangan = 1

    while (bilangan <= 10) {
        println(bilangan++)
    }

    catatan : bilangan++ sama saja dengan bilangan = bilangan + 1

    ===========================================================================

    3. DO WHILE

    do {
        statement
    } while (kondisi)

    cth :

    var bilangan = 1
    do {
        println(bilangan++)
    } while(bilangan <= 10)
 */

fun main(){

    var range = 1..10
    for (i in range) println(i)

    //========================================

    range = 1 until 30
    for (i in range) print("=")
    println("=")

    //========================================

    var range2 = 10 downTo 1
    for (i in range2) println(i)

}

/***********************************************************
 * Latihan
 *
 * 1. Tampilkan Program di bawah ini dengan looping
 *
 *  a.  12345   b.  12345   c.  11111   d.  54321   e.  ABCDE
 *      12345       1234        2222        5432        ABCD
 *      12345       123         333         543         ABC
 *      12345       12          44          54          AB
 *      12345       1           5           5           A
 *
 * 2. Buat Program Seperti Dibawah Ini
 *
 *  Masukkan Banyak Nilai : 3
 *  Masukkan Nilai Ke - 1 : 90
 *  Masukkan Nilai Ke - 2 : 100
 *  Masukkan Nilai Ke - 3 : 80
 *  Jumlah Nilai    : 270
 *  Rata - Rata     : 90
 *  Index Nilai     : A
 *
 */