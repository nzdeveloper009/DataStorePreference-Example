package com.syedzada.android.datastorepreferencesexample.ui.main

import com.syedzada.android.datastorepreferencesexample.R
import com.syedzada.android.datastorepreferencesexample.databinding.ActivityMainBinding
import com.syedzada.android.datastorepreferencesexample.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun setupViews() {
        binding.viewModel = diComponent.phonebookViewModel
        binding.lifecycleOwner = this
    }

    override fun observeViewModel() {
    }
}