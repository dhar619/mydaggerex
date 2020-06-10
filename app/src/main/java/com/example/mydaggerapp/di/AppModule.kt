package com.example.mydaggerapp.di

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun providesSomeString(): String {
        return "From App Module"
    }
}