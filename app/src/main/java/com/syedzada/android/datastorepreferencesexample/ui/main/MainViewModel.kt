package com.syedzada.android.datastorepreferencesexample.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.syedzada.android.datastorepreferencesexample.di.DIComponent
import com.syedzada.android.datastorepreferencesexample.model.Phonebook
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel() : ViewModel() {
    private val diComponent by lazy {
        DIComponent()
    }

    var name: MutableLiveData<String> = MutableLiveData("")
    var address: MutableLiveData<String> = MutableLiveData("")
    var phone: MutableLiveData<String> = MutableLiveData("")

    var phonebookName: MutableLiveData<String> = MutableLiveData("")
    var phonebookAddress: MutableLiveData<String> = MutableLiveData("")
    var phonebookPhone: MutableLiveData<String> = MutableLiveData("")

    fun saveData() {
        viewModelScope.launch(Dispatchers.IO) {
            diComponent.implRepository.savePhoneBook(
                Phonebook(
                    name.value!!,
                    address.value!!,
                    phone.value!!
                )
            )
        }
    }

    fun loadData() {
        viewModelScope.launch(Dispatchers.IO) {
            diComponent.implRepository.getPhoneBook().collect {
                it?.let { phonebook ->
                    phonebookName.postValue(phonebook.name)
                    phonebookAddress.postValue(phonebook.address)
                    phonebookPhone.postValue(phonebook.phone)
                }
            }
        }
    }
}