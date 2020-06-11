package com.example.mydaggerapp

import android.app.Application
import com.example.mydaggerapp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MyApplication : Application(), HasAndroidInjector {

    /**
     * Reducing boilerplate code, new version has only HasAndroidInjector not like
     * HasActivityInjector, HasServiceInjector, HasBroadcastReceiverInjector, HasSupportFragmentInjector
     * need to implement many interfaces, so DispatchingAndroidInjector<Any>
     */
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        /**
         * DaggerAppComponent will be generated only after writing AppComponent
         */
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }
}