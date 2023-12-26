package com.example.aclass

import android.util.Log
import javax.inject.Inject

class Teacher @Inject constructor(
    private val Stu : Student
) {
    fun library(){
//        Log.d("mozhgan","im library")

        Log.d("mohammad","NameLibrary")
        Stu.book()
    }
}