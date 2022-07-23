package com.example.daggerdemo

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private val provaiderService: ProvaiderService) {
    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

    fun getConnection(){
        provaiderService.getServiceProvider()
    }
}