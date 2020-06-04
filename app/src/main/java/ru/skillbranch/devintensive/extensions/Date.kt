package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR
const val YEAR = 365 * DAY

fun Date.format(pattern:String="HH:mm:ss dd.MM.yy"):String{
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

fun Date.add(value:Int, units: TimeUnits = TimeUnits.SECOND):Date{
    var time = this.time

    time += when(units){
        TimeUnits.SECOND -> value * SECOND
        TimeUnits.MINUTE -> value * MINUTE
        TimeUnits.HOUR -> value * HOUR
        TimeUnits.DAY -> value * DAY
    }
    this.time = time
    return this
}

enum class TimeUnits{
    SECOND,
    MINUTE,
    HOUR,
    DAY
}

//fun Date.humanizeDiff(date: Date = Date()): String {
fun Date.humanizeDiff(): String {
    val currentDate = Date()
    //val difference = currentDate.compareTo(this)
    val difference = currentDate.time - this.time
    val result:String

    result = when{
        difference <= MINUTE -> "только что"
        difference <= MINUTE * 3 -> "несколько минут назад"
        difference <= HOUR -> "менее часа назад"
        difference <= HOUR * 3 -> "час назад"
        difference <= DAY -> "несколько часов назад"
        difference <= DAY * 3 -> "несколько дней назад"
        difference <= YEAR -> "более года назад"
        difference >= YEAR -> "более чем через год"
        else -> "давно"
    }
    return result
}