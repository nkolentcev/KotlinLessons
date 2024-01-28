package org.example.lesson_1

fun main() {
    val year: Int = 1961
    var hour: String = "09"
    var minnute: String = "07"
    println(year)
    println(hour)
    println(minnute)
    hour = "10"
    minnute = "55"
    print("[%s:%s]".format(hour, minnute))
}