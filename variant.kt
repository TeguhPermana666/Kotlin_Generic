package com.dicoding.kotlin.generic

/*
Variant adalah suatu teknik untuk mengkaitkan satu sama lain anatara komponen subtype yang sama dan argumen yg berbeda
saling berkaitan
 */
//ini adalah variance:
/*
car dan motor adalah subtype dari vechiles dengan argumen yg berbeda car argumen 2 dan motor 10
 */
abstract class vechiles(roda :Int)
class car(speed:Int):vechiles(2)
class motor(speed:Int):vechiles(10)
fun main() {
    val mobil = car(200)
    val bic = motor(100)
    var Kendaraan: vechiles = mobil
    Kendaraan = bic
    println(mobil)
    println(bic)
    println(Kendaraan)
    //car dan motor adalah subtype dari vechiles jadi dapat di assigment sebagai berikut
    //var Kendaraan: vechiles
    //    Kendaraan = bic
/*Output
    com.dicoding.kotlin.generic.car@2f4d3709
    com.dicoding.kotlin.generic.motor@4e50df2e
    com.dicoding.kotlin.generic.motor@4e50df2e
*/

        //Gneric variance?
/*
1.covariant ->out/get
2.contravariant->in/set

1.interface List<out E> : Collection<E> {
    operator fun get(index: Int): E
}

2.interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}
 */
}



