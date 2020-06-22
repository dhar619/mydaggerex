package com.example.mydaggerapp.di

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideSomeString(): String {
        return "This is my first Dagger DI using ViewModel."
    }

}