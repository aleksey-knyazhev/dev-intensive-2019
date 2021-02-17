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

    //fun getData() : LiveData<List<UserItem>>{
    fun getUsersData() : LiveData<List<UserItem>>{
        return userItems
    }

    fun getSelectedData():LiveData<List<UserItem>> = selectedItems

    fun handleSelectedItem(userId:String){
        userItems.value = userItems.value!!.map{
            if(it.id == userId) it.copy(isSelected =! it.isSelected)
            else it
        }
    }

    fun handleRemoveChip(userId: String) {
        userItems.value = userItems.value!!.map{
            if(it.id == userId) it.copy(isSelected = false)
            else it
        }
    }
    private fun loadUsers(): List<UserItem> = groupRepository.loadUsers().map{it.toUserItem()}
}
