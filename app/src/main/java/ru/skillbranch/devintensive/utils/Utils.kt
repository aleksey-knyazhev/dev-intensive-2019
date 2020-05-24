package ru.skillbranch.devintensive.utils

import java.util.*


object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{
        val parts: List<String>? = fullName?.split(" ")
        var firstName = parts?.getOrNull(0)
        //if (firstName == "") firstName = "null"
        if (firstName == "") firstName = null
        var lastName = parts?.getOrNull(1)
        //if (lastName == "") lastName = "null"
        if (lastName == "") lastName = null
//        return Pair(firstName, lastName)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider:String = " "): String {
        var result = ""
        var transliteratedSymbol: String

        for (symbol in payload.replace(divider, "")) {
            transliteratedSymbol = when(symbol.toString().toLowerCase(Locale.ROOT)){
                "а" -> "a"
                "б" -> "b"
                "в" -> "v"
                "г" -> "g"
                "д" -> "d"
                "е" -> "e"
                "ё" -> "e"
                "ж" -> "zh"
                "з" -> "z"
                "и" -> "i"
                "й" -> "i"
                "к" -> "k"
                "л" -> "l"
                "м" -> "m"
                "н" -> "n"
                "о" -> "o"
                "п" -> "p"
                "р" -> "r"
                "с" -> "s"
                "т" -> "t"
                "у" -> "u"
                "ф" -> "f"
                "х" -> "h"
                "ц" -> "c"
                "ч" -> "ch"
                "ш" -> "sh"
                "щ" -> "sh'"
                "ъ" -> ""
                "ы" -> "i"
                "ь" -> ""
                "э" -> "e"
                "ю" -> "yu"
                "я" -> "ya"
                else -> symbol.toString()
            }
            //println("symbol: $symbol transliteratedSymbol: $transliteratedSymbol")
            result += transliteratedSymbol
        }
        return result
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        var result:String? = ""

        if (firstName == null && lastName == null) return null
        if (firstName != null) result += firstName.trim()[0].toUpperCase()
        if (lastName != null) result += lastName.trim()[0].toUpperCase()
        return result
    }
}