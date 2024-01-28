package org.example.lesson_1

fun main() {
    val secondsInSpace = 6480
    val seconds = secondsInSpace % 60
    val unusedseconds = secondsInSpace - seconds
    val minutes = unusedseconds / 60
    val unusedminutes = minutes % 60
    val hours = (minutes - unusedminutes) / 60
    println("%d:%02d:%02d".format(hours, unusedminutes, seconds))
}