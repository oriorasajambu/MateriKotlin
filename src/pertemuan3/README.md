# Pertemuan Ketiga

Materi :
- Struktur Perulangan ***for***
- Struktur Perulangan ***while***
- Struktur Perulangan ***do while***

## - Struktur Perulangan ***for***

Struktur Perulangan ***for*** membutuhkan 2 - 3 ***paramater***, variable, range, interval (opsional)
```kotlin
for (variable in range) {
    statement
}
```

Dimana variable hanya perlu nama saja, tidak perlu di dideklarasi dengan ***var/var***.
Sedangkan range, dapat dibuat dengan 3 cara :

1. Menggunakan simbol ***..*** 
   
Simbol ini berfungsi untuk menghasilkan angka dari batas minimum (kiri) ***sampai dengan*** batas maximum (kanan) 
```kotlin
1 .. 10      //berisi angka dari 1 - 10

for (angka in 1 .. 3) {
    println("Hello")
}
/*
    output : 
    Hello
    Hello
    Hello
 */
```

2. Menggunakan ***until***

Berfungsi untuk menghasilkan angka dari batas minimum (kiri) ***sampai*** batas maximum (kanan)

```kotlin
1 until 10   //berisi angka dari 1 - 9

for (angka in 1 until 3) {
    println("Hello")
}
/*
    output : 
    Hello
    Hello
 */
```

3. Menggunakan ***downTo***

Berfungsi untuk menghasilkan angka dari batas maximum (kiri) ***sampai dengan*** batas minimum (kanan)

```kotlin
10 downTo 1  //berisi angka dari 10 - 1

for (x in 5 downTo 1) {
    print(x)
}
//output : 54321
```

Untuk membuat interval dapat digunakan ***step***

```kotlin
1 .. 10 step 2  //berisi angka dari 1, 3, 5, 7, 9

for (x in 1 .. 10 step 2) {
    print(x)
}
//output : 13579
```

## - Struktur Perulangan ***while***

Parameter Struktur Perulangan ***while*** berisikan kondisi, jika kondisi bernilai ***true***
maka perulangan dijalankan hingga kondisi bernilai false

```kotlin
while (kondisi) {
    statement
}
```

Untuk membuat sebuah kondisi dapat dilihat di [Pertemuan Kedua](../pertemuan2)

```kotlin
var x = 1
while(x <= 5){
    print(x++)
}
//output : 12345
```

## - Struktur Perulangan ***do while***

Struktur Perulangan ***do while*** adalah struktur perulangan yang ***minimal*** di jalan kan 1 kali
, walaupun kondisi yang di jalankan bernilai ***false***. Jika kondisi bernilai ***true*** perulangan dijalankan
hingga kondisi bernilai false

```kotlin
do {
    statement
} while (kondisi)
```

Contoh Struktur Perulangan ***do while***

```kotlin
var x = 1
do {
    print(x++)
} while (x == 0)
//output : 1
```

Struktur Perulangan lebih lanjut dapat di baca [disini](https://kotlinlang.org/docs/reference/control-flow.html#for-loops)