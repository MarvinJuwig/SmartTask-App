package com.example.smarttask.koin


import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.dsl.module
import com.example.smarttask.screens.home.HomeViewModel

val appModule = module {
        registerViewModels()
}

private fun Module.registerViewModels() {
    viewModelOf(::HomeViewModel)
}