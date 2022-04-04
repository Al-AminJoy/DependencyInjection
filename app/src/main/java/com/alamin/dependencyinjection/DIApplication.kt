package com.alamin.dependencyinjection

import android.app.Application

class DIApplication: Application() {
    lateinit var smartPhoneComponent: SmartPhoneComponent;
    override fun onCreate() {
        super.onCreate()
        smartPhoneComponent = initDagger();
    }

    private fun initDagger(): SmartPhoneComponent = DaggerSmartPhoneComponent.builder().memoryCardModule(MemoryCardModule(400)).build();
}