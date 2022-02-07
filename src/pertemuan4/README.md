# Pertemuan Keempat

Materi :
- [Function](#function)
  - [Tanpa Pengembalian Nilai](#function-tanpa-pengembalian-nilai)
  - [Dengan Pengembalian Nilai](#function-dengan-pengembalian-nilai)
- [Lambda](#lambda)
- [Higher Order Function](#higher-order-function)
- [Function Inline](#function-inline)
- [Function Extension](#function-extension)
- [Abstract Function](#abstract-function)

Function
======================

Function berfungsi untuk memisahkan syntax menjadi bagian tertentu. Function memiliki komponen - komponen seperti
***nama function***, ***parameter*** (opsional), dan ***tipe pengembalian*** (opsional).

### Function Tanpa Pengembalian Nilai
```kotlin
fun nama_function (parameter) {
    statement
}
```

Sebuah Function Dapat memiliki parameter atau pun tidak
```kotlin
fun hello () {
    println("Hello")
}

fun hello2 (nama : String) {
    println("Hello $nama")
}

fun hello3 (nama : String, alamat : String) {
    println("Hello $nama, Alamat : $alamat")
}
```

Cara memanggil function yang telah di buat
```kotlin
hello () //output : Hello
hello2 ("Rio") //output : Hello Rio
hello3 ("Rio", "Medan") //output : Hello Rio, Alamat : Medan
```

### Function Dengan Pengembalian Nilai

Mirip dengan Function Tanpa Pengembalian Nilai dimana perbedaannya 
Function Dengan Pengembalian Nilai mempunyai ***tipe data*** 
setelah parameter dan ***return*** di dalam body function

```kotlin
fun nama_function (parameter) : tipe_data {
    return statement
}
```

Statement harus memiliki tipe data yang sama dengan tipe data yang kita buat
```kotlin
fun hello () : String {
    return "Hello World"
}

fun penjumlahan (x : Int, y : Int) : Double {
    return x.toDouble() + y.toDouble()
}
```

Cara memanggil function yang telah di buat
```kotlin
var value = hello ()
print(value) //output : "Hello World"

var hasil = penjumlahan (10, 11)
print(hasil) //output : 21.0
```

Function Dengan Pengembalian Nilai dapat di singkat tanpa menggunakan 
***return***, dengan syarat stament hanya terdiri 1 baris
```kotlin
fun halodunia () = "Halo Dunia!"

fun pengurangan (x : Int, y : Int) = x-y
```

Parameter di dalam function dapat menggunakan ***default value***, jika default 
value di initialized, maka saat pemanggilan function, parameter boleh tidak diisi
```kotlin
fun perkalian (x : Int = 10, y : Int = 11) = x * y

print( perkalian () )
//output : 110
print( perkalian (2) ) //memberi nilai x = 2
//output : 22
print( perkalian (y=2) ) //memberi nilai y = 2
//output : 20
```

Parameter di dalam function juga dapat diisi dengan ***null safety***
```kotlin
fun pembagian (x : Double? = null, y : Double? = null) = x / y

print( pembagian(10.0, 2.0) )
//output : 5.0
```

***null safety*** akan dibahas lebih lanjut di [Pertemuan Keenam](../pertemuan6)

Lambda
======================

Lambda adalah ***anonymous function***, yang artinya function ini tidak memiliki nama function
```kotlin
{ parameter -> statement }

val output = { outputValue : Int -> println(outputValue) }
output(10) //output : 10

val multiplyWithTwo = { x : Int, y : Int -> x * y }
print( multiply(10, 2) ) //output : 20
```

Higher Order Function
======================

Higher Order Function adalah function yang menerima function sebagai parameter, mengembalikan function, 
atau kedua hal tersebut

```kotlin
val output = { outputValue : Int -> println(x) }

fun penjumlahan (x : Int, y : Int, output : (Int) -> Unit ){
  val hasil = x + y
  output(hasil)
}

penjumlahan(10, 11, output)
//output : 21
```

Function Inline
======================

Inline Function di deklarasi dengan menggunakan keyword ***inline*** sebelun ***fun***.
Inline Function berfungsi untuk mengoptimasi ***Performa Higher Order Function***, dengan cara
function tersebut memberitahu compiler untuk mengcopy parameter dan function ke tempat pemanggilan

```kotlin
val output = { println("Hello World!") }

inline fun hello(output : () -> Unit){
    output()
}

hello(output)
```

Function Extension
======================

Function Extension berfungsi untuk menambahkan / menciptakan function baru dari 
tipe data / ***class*** yang tersedia / dibuat, tanpa memodifikasi / perubahan pada tipe data / ***class***
tersebut

```kotlin
fun String.output(umur : Int) = 
        println("Nama : $this, Umur : $umur")


val nama = "Rio Wirawan"
val umur = 27
nama.output(umur)
//output : Nama : Rio Wirawan, Umur : 27
```

Abstract Function
======================

Abstract Function berfungsi untuk menambahkan / menciptakan function baru, dengan body / isi function yang tidak harus di buat
dengan tujuan untuk mengimplementasikan body / isi yang berbeda pada masing masing class dengan cara membungkus function didalam 
interface

```kotlin
interface ContohInterface {
    fun contohFunction(variable: String)
    fun contohFunction2 (variable1: String, variable2: String) {
        println("$variable1 ini adalah variable pertama")
        println("$variable2 ini adalah variable kedua")
    }
}

class ContohClass : ContohInterface {
    override contohFunction(variable: String){
        println("Disini Kita Dapat Memanggil Parameter = $variable")
    }
}

fun main(){
    val objek = ContohClass()
    
    objek.contohFunction("Ini Parameter")
}
```
