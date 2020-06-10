//Qualifer example
package com.example.mydaggerapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.mydaggerapp.di.qualifier.EmpQualifer
import com.example.mydaggerapp.di.qualifier.ShriQualifer
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val log: String = "MainActivity"

    @Inject
    @ShriQualifer lateinit var student1: Student

    @Inject
    @EmpQualifer lateinit var student2: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)
        Log.i(log, "Student 1 = " + student1)
        Log.i(log, "Student 2 = " + student2)
    }
}
