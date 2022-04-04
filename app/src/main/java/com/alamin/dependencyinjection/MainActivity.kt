package com.alamin.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var smartPhone: SmartPhone;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // DaggerSmartPhoneComponent.create().getSmartPhone().makeACallWithRecording()

      //  DaggerSmartPhoneComponent.create().inject(this);

      //  DaggerSmartPhoneComponent.builder().memoryCardModule(MemoryCardModule(200)).build().inject(this);

        (application as DIApplication).smartPhoneComponent.inject(this);

        smartPhone.makeACallWithRecording()

    }
}