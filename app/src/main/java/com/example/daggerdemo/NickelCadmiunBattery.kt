package com.example.daggerdemo

import android.util.Log
import javax.inject.Inject

class NickelCadmiunBattery @Inject constructor() : Battery {
    override fun getPower() {
        Log.i("MYTAG", "NickelCadmiunBattery power is available")
    }
}