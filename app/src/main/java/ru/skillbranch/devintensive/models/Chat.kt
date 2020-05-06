package ru.skillbranch.devintensive.models

class Chat(
    val id:String,
    val member:MutableList<User> = mutableListOf(),
    val massage:MutableList<BaseMessage> = mutableListOf()
) {
}