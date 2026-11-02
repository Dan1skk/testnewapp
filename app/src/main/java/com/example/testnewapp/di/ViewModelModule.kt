package com.example.testnewapp.di

import com.example.testnewapp.main.MainViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val ViewModelModule = module {
    viewModelOf(::MainViewModel)
}