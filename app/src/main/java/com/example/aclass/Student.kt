package com.example.aclass

import android.util.Log
import javax.inject.Inject

class Student @Inject constructor(
) {
    fun book(){
        Log.d("mohammad","NameBook")
    }
}