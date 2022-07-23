package com.example.daggerdemo

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(battery: Battery, simCard: SIMCard, memoryCard: MemoryCard) {

    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailablity()
        Log.i("MYTAG", "SmartPhone Constructed")
    }

    fun makeACallWithRecording() {
        Log.i("MYTAG", "Calling.....")
    }
}