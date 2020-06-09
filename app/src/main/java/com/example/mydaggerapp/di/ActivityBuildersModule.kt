package com.example.mydaggerapp.di

import com.example.mydaggerapp.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    //let dagger know that MainActivity is a client
    @ContributesAndroidInjector
    abstract fun contributeMainActivity() : MainActivity

}