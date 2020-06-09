package com.example.mydaggerapp.di

import com.example.mydaggerapp.Student
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun providesStudent(): Student {
        return Student("Shridhar", 111)
    }

}