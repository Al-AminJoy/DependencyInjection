package com.alamin.dependencyinjection

import dagger.Component

@Component(modules = [MemoryCardModule::class,NCBatteryModule::class])
interface SmartPhoneComponent {
   // fun getSmartPhone(): SmartPhone
    fun inject(mainActivity: MainActivity)
}