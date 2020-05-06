package ru.skillbranch.devintensive.utils

import android.service.voice.AlwaysOnHotwordDetector

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{
        //TODO Fix
        val parts: List<String>? = fullName?.split(" ")
        var firstName = parts?.getOrNull(0)
        if (firstName == "") firstName = "null"
        var lastName = parts?.getOrNull(1)
        if (lastName == "") lastName = "null"
//        return Pair(firstName, lastName)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider:String = ""): String {
        //TODO
        return ""
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        //TODO
        return ""
    }
}