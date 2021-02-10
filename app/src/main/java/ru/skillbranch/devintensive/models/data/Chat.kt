package ru.skillbranch.devintensive.models.data

import ru.skillbranch.devintensive.extensions.shortFormat
import ru.skillbranch.devintensive.models.BaseMessage
import ru.skillbranch.devintensive.utils.Utils
import java.util.*

data class Chat(
    val id:String,
    val title:String,
    val members:List<User> = listOf(),
    var messages:MutableList<BaseMessage> = mutableListOf(),
    var isArchived:Boolean = false
) {
    private fun unreadableMessageCount():Int{
        //TODO unreadableMessageCount
        return 0
    }

    private fun lastMessageDate():Date?{
        //TODO lastMessageData
        return Date()
    }

    private fun lastMessageShort():Pair<String, String>{
        //TODO lastMessageShort
        return "Сообщений еще нет" to "@John_Doe"
    }

    private fun isSingle():Boolean = members.size == 1

    fun toChatItem(): ChatItem {
        return if(isSingle()){
            val user = members.first()
            ChatItem(
                id,
                user.avatar,
                Utils.toInitials(user.firstName, user.lastName) ?: "??",
                "${user.firstName?:""} ${user.lastName?:""}",
                lastMessageShort().first,
                unreadableMessageCount(),
                lastMessageDate()?.shortFormat(),
                user.isOnLine
            )
        }else{
            ChatItem(
                id,
                null,
                "",
                title,
                lastMessageShort().first,
                unreadableMessageCount(),
                lastMessageDate()?.shortFormat(),
                false,
                ChatType.GROUP,
                lastMessageShort().second
            )
        }
    }
}

enum class ChatType{
    SINGLE,
    GROUP,
    ARCHIVE
}
