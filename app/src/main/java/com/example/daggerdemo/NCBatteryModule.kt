package com.example.daggerdemo

import dagger.Binds
import dagger.Module

@Module
abstract class NCBatteryModule {
    @Binds
    abstract fun providerNCBattery(nickelCadmiunBattery: NickelCadmiunBattery): Battery
}