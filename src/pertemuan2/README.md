# Pertemuan Kedua

Materi :
- [Operator](#operator)
- [Struktur Keputusan](#struktur-keputusan)
    - [***if***](#struktur-keputusan-if)
    - [***when***](#struktur-keputusan-when)

Operator
======================

- ***Operator Assignment***
- ***Operator Aritmatik***
- ***Operator Perbandingan***
- ***Operator Logic***

Operator Assignment dan Operator Aritmatik telah dibahas sebelum nya di 
[Pertemuan Pertama](../pertemuan1).

- **Operator Perbandingan**

| Operator                     | Symbol | Contoh                | Hasil              |
|------------------------------|--------|-----------------------|--------------------|
| Sama dengan                  | ==     | 10==10, 10==5         | true, false        |
| Tidak sama dengan            | !=     | 10!=11, 10!=10        | true, false        |
| Lebih besar dari             | *>*    | 10>9, 10>20, 10>10    | true, false, false |
| Lebih kecil dari             | <      | 10<20, 10<5, 10<10    | true, false, false |
| Lebih besar sama dengan dari | >=     | 10>=5, 10>=20, 10>=10 | true, false, true  |
| Lebih kecil sama dengan dari | <=     | 10<=20, 10<=5, 10<=10 | true, false, true  |

- **Operator Logic**

Operator Logic terbagi 2 operator **AND** dan operator **OR**. Fungsi dari Operator Logic adalah 
untuk menggabungkan 2 atau lebih kondisi menjadi 1 kondisi.

1. **Operator AND**

| Kondisi 1 | Kondisi 2 | Hasil |
|-----------|-----------|-------|
| true      | true      | true  |
| true      | false     | false |
| false     | true      | false |
| false     | false     | false |

2. **Operator OR**

| Kondisi 1 | Kondisi 2 | Hasil |
|-----------|-----------|-------|
| true      | true      | true  |
| true      | false     | true  |
| false     | true      | true  |
| false     | false     | false |

Struktur Keputusan
======================

Struktur Keputusan berfungsi untuk memilih / mengontrol proses eliminasi di dalam program.
Lebih lengkap dapat anda baca [disini](https://en.wikipedia.org/wiki/Conditional_(computer_programming)).

Struktur Keputusan ***if***
======================

Untuk membuat sebuah Struktur Keputusan anda dapat menggunakan struktur syntax dibawah ini
```kotlin
if(kondisi) {
    statement
}
```
Kondisi dapat dibuat dengan menggunakan **Operator Perbandingan**, dimana Operator tersebut digunakan
untuk membandingkan 2 variable
```kotlin
var x = 10
var y = 11
if(x < y) {
    statement
}
```
Statement adalah syntax yang akan dijalankan ketika kondisi yang telah dibuat bernilai ***true***
```kotlin
var x = 10
var y = 11
if(x < y) { //kondisi bernilai true
    println("$x < $y")
}
//output : 10 < 11
```
Jika ingin menambahkan kondisi, dapat menggunakan syntax ***else if***
```kotlin
var x = 11
var y = 10
if(x < y) { //kondisi bernilai false
    println("$x < $y")
}
else if(x > y){ //kondisi bernilai true
    println("$x > $y")
}
//output : 11 > 10
```
Pada contoh diatas struktur keputusan tersebut mengeliminasi kondisi pertama,
karena bernilai false, maka program akan mengecek kondisi selanjutnya.

Jika ingin menambahkan ***kondisi default*** (kondisi yg mana kondisi-kondisi sebelum nya bernilai ***false***)
dapat menggunakan syntax ***else***
```kotlin
var x = 10
var y = 10
if(x < y) { //kondisi bernilai false
    println("$x < $y")
}
else if(x > y){ //kondisi bernilai false
    println("$x > $y")
}
else { 
    println("$x = $y")
}
//output : 10 = 10
```

Struktur Keputusan ***when***
======================

Struktur Keputusan ***when*** merupakan alternatif dari Struktur Keputusan ***if***.
```kotlin
when(variable) {
    value1 -> statement1
    value2 -> statement2
    else -> statement default
}
```

Struktur Keputusan ***when*** dapat menggunakan Operator Logic
```kotlin
when {
    variable > value1 -> statement1
    variable < value2 -> statement1
    else -> statement default
}
```
Untuk Dokumentasi lebih lengkap dapat di cek [disini](https://kotlinlang.org/docs/reference/control-flow.html#when-expression)