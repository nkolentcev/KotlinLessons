package org.example.lesson_1

fun main() {
    val TIME_SPLITTER = 60
    val secondsInSpace = 6480
    val seconds = secondsInSpace % TIME_SPLITTER
    val unusedseconds = secondsInSpace - seconds
    val minutes = unusedseconds / TIME_SPLITTER
    val unusedminutes = minutes % TIME_SPLITTER
    val hours = (minutes - unusedminutes) / TIME_SPLITTER
    println("%d:%02d:%02d".format(hours, unusedminutes, seconds))
}