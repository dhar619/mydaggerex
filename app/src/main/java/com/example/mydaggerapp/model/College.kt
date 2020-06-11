package com.example.mydaggerapp.model

import javax.inject.Inject

class College @Inject constructor(private val student: Student) {
    fun getStudentFrom(): Student {
        return student
    }
}