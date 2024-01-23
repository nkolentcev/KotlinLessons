package org.example.lesson_1

fun main() {
    //println("Hello Kotlin world") //<- TODO - убрать неиспользуемое
    // var переменные (заказы и количество) val константные - не изменяемые ?
    var ordersQuality: Int = 42
    val gratitudeMessage: String = "Примите благодарность за покупку! Вы сделали удачный выбор \uD83D\uDE0A"
    var amountOfWorkers: Int = 2000
    ordersQuality = 0 //<- TODO - сбросить в начальное значение
    //task 2
    println(ordersQuality)
    println(gratitudeMessage)
    // println(amountOfWorkers) //<- TODO - убрать неиспользуемое
    amountOfWorkers -=1
    println(amountOfWorkers)
}
