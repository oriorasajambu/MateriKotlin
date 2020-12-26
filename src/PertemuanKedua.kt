/*
 * Copyright (c) 2020. Silahkan di copy paste guys
 * Kalau ada yg mau di tanya silahkan di chat via Group WA / request di Github
 * Sekalian follow di instagram @riowiraawan
 */

/*
    Pertemuan Kedua (Struktur Keputusan, if dan when)

    1. IF

    if(kondisi) {
        statement
    }
    else {
        statement default
    }

    if(kondisi 1) {
        statement 1
    }
    else if(kondisi 2){
        statement 2
    }
    else if(kondisi 3){
        statement 3
    }
    ..dst
    else {
        statement default
    }

    operator perbandingan

    ==  -> sama dengan                      -> =
    !=  -> tidak sama dengan                -> =/=
    >   -> lebih besar dari                 -> >
    >=  -> lebih besar sama dengan dari     -> >=
    <   -> lebih kecil dari                 -> <
    <=  -> lebih kecil dari sama dengan     -> <=

    operator logic

    && -> AND Operator -> DAN
    || -> OR  Operator -> ATAU

    Tabel Kebenaran AND
    Kondisi 1   Kondisi 2   Hasil
    F           F           F
    T           F           F
    F           T           F
    T           T           T

    Tabel Kebenaran OR
    Kondisi 1   Kondisi 2   Hasil
    F           F           F
    T           F           T
    F           T           T
    T           T           T

    2. WHEN

    a.

    when (variable) {
        variable_value_1 -> {
            statement 1
        }
        variable_value_2 -> {
            statement 2
        }
        variable_value_3 -> {
            statement 3
        }
        ..dst
        else -> {
            statement default
        }
    }

    b.

    when {
        variable1 operator variable2 -> {
            statement 1
        }
        ..dst
        else -> {
            statement default
        }
    }
 */

fun main(){

    /*
        Cth If Dengan Operator ==
        NB : Jika Statement Hanya Terdiri 1 Baris, { } tidak perlu di ketik
     */

    print("Masukkan Cuaca Hari Ini : ")
    val cuaca = readLine()!!.toString()

    if (cuaca == "cerah")
        println("Tidak Perlu Bawa Payung")
    else if (cuaca == "hujan")
        println("Bawa Payung")
    else if (cuaca == "badai" )
        println("Jangan Keluar Rumah")
    else
        println("Cuaca Tidak Terdeteksi")

    /*
        Cth IF Dengan Operator Logic
     */

    print("Masukkan Cuaca Hari Ini : ")
    val cuaca_hari_ini = readLine()!!.toString()
    print("Masukkan Cuaca Hari Ini : ")
    val cuaca_besok = readLine()!!.toString()

    if (cuaca_hari_ini == "cerah" && cuaca_besok == "cerah")
        println("Hari Ini Dan Besok Tidak Perlu Bawa Payung")
    else if (cuaca_hari_ini == "cerah" && cuaca_besok == "hujan")
        println("Hari Ini Tidak Usah Bawa Payung, Besok Bawa Payung")
    else if (cuaca_hari_ini == "hujan" && cuaca_besok == "cerah")
        println("Hari Ini Bawa Payung, Besok Tidak Perlu Bawa Payung")
    else if (cuaca_hari_ini == "hujan" && cuaca_besok == "hujan")
        println("Hari Ini Dan Besok Bawa Payung")
    else
        println("Cuaca Hari Ini Atau Besok Tidak Terdeteksi")

    /*
        Cth WHEN
        NB : Jika Statement Hanya Terdiri 1 Baris, { } tidak perlu di ketik
        Tips : letakkan kursor di if / when, lalu klik alt + enter, lalu Pilih Replace ...
     */
    print("Masukkan Cuaca Hari Ini : ")
    val cuaca2 = readLine()!!.toString()

    when (cuaca2) {
        "cerah" -> println("Tidak Perlu Bawa Payung")
        "hujan" -> println("Bawa Payung")
        "badai" -> println("Jangan Keluar Rumah")
        else -> println("Cuaca Tidak Terdeteksi")
    }

}

/*********************************
 *
 *  Latihan
 *
 *  1. Buat Program Menu Sederhana
 *
 *      Cth :
 *
 *      Menu :
 *      1. Ayam Goreng
 *      2. Ayam Geprek
 *      3. Ayam Panggang
 *      Pilihan : 1
 *      Anda Memilih Ayam Goreng
 *
 *      NB : Pilihan : 1 adalah I/O dan Anda Memilih Ayam Goreng adalah output setelah menginput
 *
 *  2. Buat Program Kalkulator Sederhana
 *
 *      Cth :
 *
 *      Masukkan Nilai Pertama : 10
 *      Masukkan Nilai Kedua : 11
 *      Pilih Operator :
 *      1. +
 *      2. -
 *      3. *
 *      4. /
 *      Pilihan : -
 *      Hasil = -1
 *
 *      Tips : gunakan readLine()!![0] untuk input operator
 *
 *  3. Buat Program Converter Nilai Menjadi Huruf
 *
 *      Cth :
 *
 *      Masukkan Nilai : 78
 *      Maka Nilai Anda : C
 *
 *
 *  4. Buat Program Program Login Sederhana
 *
 *      Cth :
 *
 *      Masukkan Username : admin
 *      Masukkan Password : admin
 *      Berhasil Login!
 *
 *      Masukkan Username :
 *      Masukkan Password : admin
 *      Isi Username / Password Terlebih Dahulu
 *
 *      Masukkan Username : admin
 *      Masukkan Password :
 *      Isi Username / Password Terlebih Dahulu
 *
 *      Masukkan Username :
 *      Masukkan Password :
 *      Isi Username / Password Terlebih Dahulu
 *
 *      Masukkan Username : aaadmin
 *      Masukkan Password : admin
 *      Password salah
 *
 *      Masukkan Username : admin
 *      Masukkan Password : aaadmin
 *      Password salah
 *
 *  5. Buat Program Jika Berhasil Login Menampilkan Menu Pilihan
 *
 */