package com.example.mydaggerapp.di

import com.example.mydaggerapp.Student
import com.example.mydaggerapp.di.qualifier.EmpQualifer
import com.example.mydaggerapp.di.qualifier.ShriQualifer
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    @ShriQualifer
    fun providesStudent(): Student {
        return Student("Shridhar", 111)
    }

    @Provides
    @EmpQualifer
    fun providesEmp(): Student {
        return Student("IBM", 123)
    }

}