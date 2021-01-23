package ru.skillbranch.devintensive.models.data

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

data class User (
    val id:String,
    var firstName:String?,
    var lastName:String?,
    var avatar:String?,
    var rating:Int = 0,
    var respect:Int = 0,
    var lastVisit:Date? = null,
    var isOnLine:Boolean = false
//    var introBit: String
) {
//    var introBit: String = getIntro()
//    var introBit: String = "getIntro()"
//    var introBit: String

    constructor(id:String, firstName: String?, lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    constructor(id: String) : this(id, "John", "Doe")

    init {
//        introBit = "$firstName $lastName"
//        introBit = getIntro()
        /*println("It's alive! \n${if(lastName==="Doe") "His name id $firstName $lastName" else "And his name is $firstName $lastName!" }\n" +
        "${getIntro()}" +
        "$introBit")*/
        //println("It's alive! \n${if(lastName==="Doe") "His name id $firstName $lastName" else "And his name is $firstName $lastName!" }")
    }

    companion object Factory {
        private var lastId: Int = -1
        fun makeUser(fullName: String?): User {
            lastId++

            /*val parts: List<String>? = fullName?.split(" ")
            var firstName = parts?.getOrNull(0)
            if (firstName == "") firstName = "null"
            var lastName = parts?.getOrNull(1)
            if (lastName == "") lastName = "null"*/

            val (firstName, lastName) = Utils.parseFullName(fullName)
            return User(id= "$lastId", firstName = firstName, lastName = lastName)
        }
    }

    /*private fun getIntro() = """
        pip pip pip pibip
        pip pibip
        
        pip pip pip pibip
        pip pibip
        ${"\n\n\n"}
        $firstName $lastName
        
    """.trimIndent()*/

    /*fun printMe() = println("""
            id: $id
            firstName: $firstName
            lastName: $lastName
            avatar: $avatar
            rating: $rating
            respect: $respect
            lastVisit: $lastVisit
            isOnLine: $isOnLine
        """.trimIndent())*/
}