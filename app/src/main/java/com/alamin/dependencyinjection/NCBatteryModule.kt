package com.alamin.dependencyinjection

import dagger.Binds
import dagger.Module

@Module
abstract class NCBatteryModule {
    @Binds
    abstract fun bindsNCBattery(nickelCadmiumBattery: NickelCadmiumBattery): Battery
}