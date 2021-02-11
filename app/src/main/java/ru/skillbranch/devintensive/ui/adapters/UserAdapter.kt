package ru.skillbranch.devintensive.ui.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import ru.skillbranch.devintensive.models.data.UserItem
import javax.xml.transform.ErrorListener

class UserAdapter(val listener: (UserItem)->Unit) : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){
    private val items : List<UserItem> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = items.size

    inner class UserViewHolder(convertView:View) : RecyclerView.ViewHolder(convertView), LayoutContainer {
        override val containerView: View?
            get() = itemView

        fun bind(user:UserItem, listener: (UserItem)->Unit){

        }

    }
}