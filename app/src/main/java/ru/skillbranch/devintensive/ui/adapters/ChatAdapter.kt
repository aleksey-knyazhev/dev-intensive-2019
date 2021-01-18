package ru.skillbranch.devintensive.ui.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.skillbranch.devintensive.R
import ru.skillbranch.devintensive.models.data.ChatItem

class ChatAdapter : RecyclerView.Adapter<ChatAdapter.SingleViewHolder>() {
    var items : List<ChatItem> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val convertView = inflater.inflate(R.layout.item_chat_single, parent, false)
        Log.d("M_ChatAdapter", "onCreateViewHolder")
        return SingleViewHolder(convertView)
    }

    override fun onBindViewHolder(holder: SingleViewHolder, position: Int) {
        Log.d("M_ChatAdapter", "onCreateViewHolder $position")
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class SingleViewHolder(convertView: View) : RecyclerView.ViewHolder(convertView) {


        fun bind(item:ChatItem){

        }
    }
}
