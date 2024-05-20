package com.syedzada.android.datastorepreferencesexample.di

import com.syedzada.android.datastorepreferencesexample.repository.ImplRepository
import com.syedzada.android.datastorepreferencesexample.ui.main.MainViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class DIComponent: KoinComponent {
     val phonebookViewModel by inject<MainViewModel>()
     val implRepository by inject<ImplRepository>()
}