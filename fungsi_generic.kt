package com.dicoding.kotlin.generic
/*deklarasi function generic of inheritence
fun <T> run(): T {
    /*...*/
}
*/

/*deklarasi function extension
public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
 /*...*/
}
*/

fun main() {
  val numbers = (1..100).toList()
  print(numbers.slice<Int>(1..10))
}
//slice disini sebagai receiver dan return type
//penampung nilai misal numbers terdiri dari 1-100 dari index 0
// receiver dan return nilai dari index 1..10