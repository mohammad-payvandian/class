package com.example.aclass

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class Fragment : Fragment() {
    @Inject
    lateinit var teach : Teacher

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
       savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
//        Log.d("mozhgan","im fragmen")

        Log.d("mozhgan","im function library")

        teach.library()

        return inflater.inflate(R.layout.fragment_, container, false)


    }

}