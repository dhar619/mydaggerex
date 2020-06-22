package com.example.mydaggerapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    private val someString: String
) : ViewModel() {
    private val someStringLiveData = MutableLiveData<String>()

    fun getSomeStringLiveData():LiveData<String>{
        return someStringLiveData
    }

    fun submit(){
        someStringLiveData.postValue(someString)
    }

}