package com.example.mydaggerapp.di

import com.example.mydaggerapp.Student
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    @CustomScope
    fun providesStudent(): Student {
        return Student("MainActivityModule", 123)
    }

}