package com.dicoding.kotlin.generic

/*
Generic adalah memungkinkan suatu kelas atau interface menjadi tipe parameter yang dapat
    digunakan untuk berbagai macam tipe data
    =>menentukan tipe data yang akan digunakan dengan tipe parameter <>
    interface List<T>{
        operator fun get(index: Int) : T
    }
    T disini adalah tipe reguler

    =>jika mewarisi kelas atau interface generic bisa sebagai berikut
    class LongList : List<Long>{
        override fun get(index: Int): Long {
            return this[index]
        }
    }

    class ArrayList<T> : List<T>{
        override fun get(index: Int): T {
            return this[index]
        }
    }
    Karena pada ArrayList menggunakan tipe parameter T maka pada saat di insialisasi perlu di cantumkan tipenya

 */
fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
    println(firstLong)
}

class ArrayList<T> : List<T> {//T Arraylist disini bersifat lokal paramter jadi ga sama kayak T di list

    override operator fun get(index: Int): T {
        return this[index]
    }
}

interface List<T> {
    operator fun get(index: Int): T
}
/*
atau bisa juga seperti ini
class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

interface List<P> {
    operator fun get(index: Int): P
}
 */