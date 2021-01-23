package ru.skillbranch.devintensive.models.data

import ru.skillbranch.devintensive.models.BaseMessage

class Chat(
    val id:String,
    val member:MutableList<User> = mutableListOf(),
    val massage:MutableList<BaseMessage> = mutableListOf()
) {
}