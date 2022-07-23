package com.example.daggerdemo

import android.util.Log
import javax.inject.Inject

class ProvaiderService @Inject constructor(){
    init {
        Log.i("MYTAG","Service Provider Constructed")
    }

    fun getServiceProvider(){
        Log.i("MYTAG","Service provider connected")
    }
}