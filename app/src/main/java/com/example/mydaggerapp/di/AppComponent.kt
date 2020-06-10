package com.example.mydaggerapp.di

import android.app.Application
import com.example.mydaggerapp.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuildersModule::class,
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {

        // triggered at the creation time of component
        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent
    }
}