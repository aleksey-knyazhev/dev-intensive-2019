package ru.skillbranch.devintensive.viewmodels

import android.service.autofill.UserData
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import ru.skillbranch.devintensive.extensions.mutableLiveData
import ru.skillbranch.devintensive.models.data.UserItem
import ru.skillbranch.devintensive.repositories.GroupRepository

class GroupViewModel : ViewModel() {
    private val groupRepository = GroupRepository
    private val userItems = mutableLiveData(loadUsers())
    private val selectedItems = Transformations.map(userItems) { users -> users.filter { it.isSelected }}

    fun getData() : LiveData<List<UserItem>>{
        return userItems
    }

    fun getSelectedData():LiveData<List<UserData>> = selectedItems

    fun handleSelectedItem(userId:String){

    }

    private fun loadUsers(): List<UserItem> = groupRepository.loadUsers().map{it.toUserItem()}
}
