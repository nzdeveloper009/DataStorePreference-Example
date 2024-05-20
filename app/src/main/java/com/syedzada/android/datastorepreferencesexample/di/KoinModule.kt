package com.syedzada.android.datastorepreferencesexample.di

import com.syedzada.android.datastorepreferencesexample.repository.ImplRepository
import com.syedzada.android.datastorepreferencesexample.ui.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val repositoryModule = module {
    single { ImplRepository(androidContext()) }
}

val viewModelModule = module {
    viewModel { MainViewModel() }
}

val appModule = listOf(repositoryModule, viewModelModule)