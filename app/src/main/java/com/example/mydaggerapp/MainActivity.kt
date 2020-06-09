package com.example.mydaggerapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val log: String = "MainActivity"

    @Inject
    lateinit var student1: Student

    @Inject
    lateinit var student2: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)
        Log.i(log, "Student 1 = " + System.identityHashCode(student1))
        Log.i(log, "Student 2 = " + System.identityHashCode(student2))
    }
}
