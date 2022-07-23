package com.example.daggerdemo

import android.app.Application

class SmartPhoneAplications : Application() {
    lateinit var samrtPhoneComponent: SamrtPhoneComponent
    override fun onCreate() {
        samrtPhoneComponent = initDagger()
        super.onCreate()
    }

    private fun initDagger(): SamrtPhoneComponent =
        DaggerSamrtPhoneComponent.builder().memoryCardModule(MemoryCardModule(100))
            .build()
}