package com.example.mydaggerapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.mydaggerapp.model.College
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val log: String = "MainActivity"

    // Student class is child for College class
    // used constructor injection to create a Student class
    @Inject
    lateinit var college: College

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)

        Log.i(log, "Student = " + college.getStudentFrom())
    }
}
