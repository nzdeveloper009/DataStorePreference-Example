package com.syedzada.android.datastorepreferencesexample.repository

import com.syedzada.android.datastorepreferencesexample.model.Phonebook
import kotlinx.coroutines.flow.Flow

interface Abstract {
    suspend fun savePhoneBook(phonebook: Phonebook)
    fun getPhoneBook(): Flow<Phonebook?>
}