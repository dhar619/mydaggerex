package com.example.mydaggerapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

/**
 * Scope example...change orentation to show how it work
 * someString is from appModule which is singleton
 * student is from MainActivityModule using Customscope
 * check the memory address in log by changing the orentation of the device
 * the activity will be created again
 */
class MainActivity : AppCompatActivity() {

    private val log: String = "MainActivity"

    @Inject
    lateinit var someString: String

    @Inject
    lateinit var student1: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)

        Log.i(log, "Some string = $someString and it's address ${System.identityHashCode(someString)}")

        Log.i(log, "Student = $student1 and it's address ${System.identityHashCode(student1)}")
    }
}
