# Pertemuan Pertama

Materi :
- Comment
- Menampilkan Text (Output)
- Deklarasi Variable
- Operator
- I/O (Input/Output)

## - Comment

Comment adalah ***catatan***, dimana membuat comment (catatan) tidak mempengaruhi syntax (coding) yang kita buat.
Comment tidak akan di compile (dibuat dalam bentuk program). Comment berfungsi untuk menjelaskan syntax yang kita buat.
Fungsi lainnya adalah menonaktifkan syntax yg kita buat agar tidak dijalankan (dicompile) oleh compiler, agar kita tidak
menghapus syntax yang kita buat

### 1 Line Comment
Catatan ini akan mempengaruhi 1 baris, jika dibawah catatan tersebut tidak dibuat comment, maka akan dianggap syntax.
Syntax yang digunakan untuk membuat 1 Line Comment adalah ***//***
```kotlin
//Ini adalah catatan
Hello World! //baris ini akan dianggap sebagai syntax
```

### Multiple Line Comment
Catatan ini akan mempengaruhi banyak baris, selama catatan yang kita buat berada di dalam syntax.
Syntax yang digunakan untuk membuat Multiple Line Comment adalah /* */
```kotlin
/*
    Ini adalah Comment
    Hello World!
 */
```

### Documentation Comment
Catatan ini sama dengan Multiple Line Comment, yang membedakannya adalah comment ini digunakan sebagai dokumentasi.
Umumnya digunakan untuk menampilkan copyright dan license.
Dokumentasi lengkap dapat di temukan [disini](https://kotlinlang.org/docs/reference/kotlin-doc.html)
```kotlin
/*
 * Copyright (c) 2021. Silahkan di copy paste guys
 * Kalau ada yg mau di tanya silahkan di chat via Group WA / request di Github
 * Sekalian follow di instagram @riowiraawan
 */
```

## - Menampilkan Text (Output)

Kita dapat menampilkan text (***Output***) di bahasa pemograman koltin dengan 2 cara :

### print()
Syntax ini digunakan untuk menampilkan text tanpa baris baru
```kotlin
print("Hello World!")
//output -> Hello World!

print("Nama saya Rio Wirawan!")
print(" Saya berasal dari Medan")
//output -> "Nama saya Rio Wirawan! Saya berasal dari Medan"
```

### println()
Syntax ini digunakan untuk menampilkan text dengan baris baru
```kotlin
println("Selamat pagi dunia!")
println("Sudah sarapan belum?")
/*
    Output :
    Selamat pagi dunia!
    Sudah sarapan belum?
 */
```

## - Deklarasi Variable
Deklarasi Variable adalah proses pembuatan wadah (variable) untuk menampung data, yang dapat digunakan (dipanggil / called) 
sewaktu waktu. Variable dibagi menjadi 2 jenis, ***mutable*** dan ***immutable***, dimana ***mutable*** adalah varible yang dapat berubah nilainya dan ***immutable***
variable yang tidak dapat berubah nilainya.

Untuk mendeklarasikan sebuah variable dibutuh 3 - 4 komponen yaitu ***var/val***, ***nama variable***, ***tipe data variable (opsional)***,
***operator assignment*** dan ***data***.
Perbedaan Antara ***var/val*** adalah gunakan ***var*** untuk data yang berubah (***mutable***), dan ***val*** untuk data yang tidak berubah (***immutable***)

```kotlin
var x : Int //inisialisasi mutable variable bernama 'x' dengan tipe data Int
val phi : Double = 3.14 //inisialisai immutable variable bernama 'phi' dengan tipe data Double dan data 3.14 
var nama : String //inisialisai mutable variable bernama 'nama' dengan tipe data String
val isChecked : Boolean = false// inisialisasi immutable variable bernama 'isChecked' dengan tipe data Boolean dan data false
```

Deklarasi Variable di bahasa pemograman kotlin secara otomatis mengetahui tipe data yg akan digunakan saat deklarasi variable
jika data secara langsung di berikan data (***inisialisasi***).

```kotlin
//Tipe data dapat tidak ditulis, variable langsung mengetahui tipe data yang digunakan
var x = 10 //tipe data yang digunakan adalah Int
var y = 3.14 //Tipe data yang digunakan adalah Double
var z = false // Tipe data yang digunakan adalah Boolean
var namaSaya = "Rio Wirawan" //Tipe data yang digunakan adalah String
```

Tipe data yang umum digunakan meliputi _angka (Number)_, _kalimat (String)_, _character_, dan _boolean_.
Tipe data number dibagi menjadi 2 bagian _bilangan bulat_ dan _bilangan berkoma_, dimana masing masing memiliki batas minimum
dan maximum

- Bilangan Bulat
    
| Type  | Size | Min Value                         | Max Value                         |
|-------|------|-----------------------------------|-----------------------------------|
| Byte  | 8    | -128                              | 128                               |
| Short | 16   | -32768                            | 32768                             |
| Int   | 32   | -2.147.483.648(-2^31)             | 2.147.483.648(2^31-1)             |
| Long  | 64   | -9.223.372.036.854.775.808(-2^63) | 9.223.372.036.854.775.808(2^63-1) |

- Bilangan Berkoma

| Type   | Size | Significant bits | Exponent bits | Decibal digits |
|--------|------|------------------|---------------|----------------|
| Float  | 32   | 24               | 8             | 6-7            |
| Double | 64   | 53               | 11            | 15-16          |

Dokumentasi lanjut dapat dilihat [disini](https://kotlinlang.org/docs/reference/basic-types.html)

## - Operator

Terdapat banyak simbol (***operator***) yang dapat digunakan didalam bahasa pemograman diantaranya :

- ***Operator Assignment***
- ***Operator Aritmatik***
- ***Operator Perbandingan***
- ***Operator Logic***

Operator Perbandingan dan Operator Logic dibahas pada Pertemuan Kedua.

Operator Assignment berfungsi untuk mengisi data kedalam sebuah variable, symbol yang digunakan adalah ***=***.
Simbol Operator Aritmatik terdiri dari ***+***, ***-***, *, ***/***, ***%***. 
```kotlin
  Operator Assignment
          |
          v
val hasil = 10 + 11
               ^
               |
       Operator Aritmatik
print(hasil) // output : 21
```
Operator Assignment dapat di kombinasikan dengan Operator Aritmatik.
```kotlin
var hasil = 0
hasil += 11 // syntax ini sama saja dengan hasil = hasil + 11
       ^
       |
Operator Kombinasi
print(hasil) // output : 11 
```
Operator ***%*** (***Modulus***) digunakan untuk mencari ***sisa pembagian***
```kotlin
val x = 10 % 3
print(x) //output : 1
```

## - I/O (Input / Output)
Untuk Melakukan proses input kita dapat menggunakan syntax berikut ini
```kotlin
readLine()!!.toInt()
```
**readLine()** digunakan untuk membaca data yang dimasukkan (***Input***), Simbol **!!** adalah ***null safety*** yang akan dibahas
lebih lanjut di Pertemuan Keenam, **.toInt()** mengkonversi (**Convert***) data menjadi tipe data Int (***Integer*** / ***Bilangan Bulat***).

Data yang di***input*** dapat di tampung di dalam variable
```kotlin
val nama = readLine()!!.toString()
```

















