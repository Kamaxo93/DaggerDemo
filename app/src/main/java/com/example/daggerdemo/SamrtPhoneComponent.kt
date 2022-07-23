package com.example.daggerdemo

import dagger.Component

@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SamrtPhoneComponent {
    fun inject(mainActivity: MainActivity)
}