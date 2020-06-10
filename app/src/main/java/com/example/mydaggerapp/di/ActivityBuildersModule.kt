package com.example.mydaggerapp.di

import com.example.mydaggerapp.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    @CustomScope
    abstract fun contributeMainActivity() : MainActivity

}