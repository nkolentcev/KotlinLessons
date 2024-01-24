package org.example.lesson_3

fun main() {
    val ordersQuality: Int = 42
    val gratitudeMessage: String = "Примите благодарность за покупку! Вы сделали удачный выбор"
    val year: Int = 1961
    var hour: String = "09"
    var minnute: String = "07"
    println(ordersQuality)
    println(gratitudeMessage)
    println(year)
    println(hour)
    println(minnute)
    hour = "10"
    minnute = "55"
    print("[%s:%s]".format(hour, minnute))
}