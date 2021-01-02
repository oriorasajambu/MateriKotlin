/*
 * Copyright (c) 2021. Silahkan di copy paste guys
 * Kalau ada yg mau di tanya silahkan di chat via Group WA / request di Github
 * Sekalian follow di instagram @riowiraawan
 */

/*
    Pertemuan Kelima (Collection / List)

    List Terbagi 2

    a. Mutable (data berubah)
    b. Immutable (data tidak dapat berubah)

    a. mutableListOf

    val dataList = mutablelist<tipe_data>()

    mutableListOf memiliki build in function, dapat di cek selengkapnya di https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/

    .add(data)              -> menambahkan data kedalam list
    .remove(data)           -> menghapus data dari list
    .clear()                -> menghapus semua data dari list
    .isEmpty()              -> mengecek list kosong atau tidak
    .isNotEmpty()           -> mengecek list kosong atau tidak
    .forEach { statement }  -> mengiterate tiap tiap data di list
    .sum()                  -> menjumlahkan semua data yg ada dilist NB : hanya untuk tipe data Int / Double / Float dll
    dst
 */

package pertemuan5

fun main(){

    val dataList = mutableListOf<String>()

    if (dataList.isEmpty()) println("List Masih Kosong!")

    dataList.add("Rio")
    dataList.add("Shinta")
    dataList.add("Winda")
    dataList.add("Widya")
    dataList.add("Wieke")

    if (dataList.isNotEmpty()) println("List Ada Isinya!")

    dataList.forEach {
        println(it)
    }

    dataList.remove("Rio")

    dataList.forEach {
        println(it)
    }

    dataList.clear()

    if(dataList.isEmpty()) println("List Kosong!")

}