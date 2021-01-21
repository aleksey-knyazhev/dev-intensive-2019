package ru.skillbranch.devintensive.ui.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_chat_single.*
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

    inner class SingleViewHolder(convertView: View) : RecyclerView.ViewHolder(convertView), LayoutContainer {
        //val iv_avatar = convertView.findViewById<AvatarImageView>(R.id.iv_avatar_single)
        //val tv_title = convertView.findViewById<TextView>(R.id.tv_title_single)

        override val containerView: View?
            get() = itemView

        fun bind(item:ChatItem){
            iv_avatar_single.setInitials(item.initials)
            tv_title_single.text = item.shortDescription
        }
    }
}
