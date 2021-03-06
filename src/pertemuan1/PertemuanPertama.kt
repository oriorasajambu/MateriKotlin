/*
 * Copyright (c) 2021. Silahkan di copy paste guys
 * Kalau ada yg mau di tanya silahkan di chat via Group WA / request di Github
 * Sekalian follow di instagram @riowiraawan
 */

/*
    Pertemuan Pertama (Comment, Menampilkan Text, Deklarasi Variable, Operasi Aritmatik, I/0)

    1. Comment

    a. 1 Line Comment -> //
    b. multiple line comment -> /**/
 */

/*
    2. Menampilkan text

    a. print("Hello World")
    b. println("Hello World")
 */

/*
    3. Deklarasi Variable

    var -> mutable (data dapat berubah)
    val -> immutable (data tidak dapat berubah)

    tipe data
    Int     -> bilangan bulat   cth 0, 1, 2, 3, -3, -123
    Double  -> bilangan berkoma cth 0.64, 10.3, 13.324
    Float   -> bilangan berkoma cth 123f
    String  -> kalimat          cth "Hello World"
    Char    -> Karakter         cth 'A', 'B'
    Boolean -> true / false

    cth Deklarasi Variable

    mutable
    var umur : Int = 10
    var umur = 10
    var nama = "Rio Wirawan"

    immutable
    val phi : Double = 3.14
    val phi = 3.14
 */

/*
    4. Operasi Aritmatik
    +
    -
    *
    /
    % -> modulus -> sisa bagi
 */

/*
    5. I/O (User Input)
    val / var variable = readLine.toTipe_data()
 */

package pertemuan1

fun main(){

    /*
        Cth Comment
     */

    // ini 1 line comment

    /*
        ini multiple line comment
     */

    /*
        Cth Menampilkan Text
     */

    print("Hello World") // menampilkan text Hello World Tanpa New line Setelah Hello World
    println("Hello World") // Menampilkan Text Hello World Dengan New Line Setelah Hello World

    /*
        Cth Deklarasi Variable
     */

    var nama = "Rio Wirawan" // membuat deklarasi mutable variable nama yang berisi "Rio Wirawan"

    println(nama) // menampilkan variable nama

    nama = "Shinta Suci Ningsih" // mengisi ulang variable nama dengan "Shinta Suci Ningsih"

    println(nama) // menampilkan variable nama

    /*
        Cth Operasi Aritmatik Sedernaha
     */

    val bilanganPertama = 10 //deklarasi variable bilanganPertama dengan nilai 10
    val bilanganKedua = 11 //deklarasi variable bilanganKedua dengan nilai 11

    val penjumlahan = bilanganPertama + bilanganKedua //deklarasi variable penjumlahan dengan nilai bilanganPertama + bilanganKedua

    println("Penjumlahan : $penjumlahan") //menampilkan hasil penjumlahan variable bilanganPertama dengan bilangankedua

    /*
        Cth I/O (User Input)
     */

    print("Masukkan Bilangan Pertama : ")
    val bilangan_pertama = readLine()!!.toInt()
    print("Masukkan Bilangan Pertama : ")
    val bilangan_kedua = readLine()!!.toInt()

    val hasil_penjumlahan = bilangan_pertama + bilangan_kedua

    println("Hasil Penjumlahan : $hasil_penjumlahan")

}

/******************************************
 *
 *  Latihan
 *
 *  1. Buat Program Pengurangan, Perkalian, Pembagian
 *
 *      NB : Hasil Pembagian Dalam Bilangan Berkoma
 *
 *
 *  2. Buat Program Converter Suhu Dari Celcius Ke Fahrenheit
 *
 *      cth :
 *      Masukkan Suhu Celcius : 32
 *      Suhu Fahreneheit : 89.6
 *
 *      NB :
 *      Dimana 32 menggunakan I/O
 *      Suhu Fahreneheit : 89.6 Adalah Outputnya
 *
 */