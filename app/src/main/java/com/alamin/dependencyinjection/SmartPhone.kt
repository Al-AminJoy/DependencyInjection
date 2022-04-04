package com.alamin.dependencyinjection

import android.util.Log
import com.alamin.dependencyinjection.Battery
import com.alamin.dependencyinjection.MemoryCard
import com.alamin.dependencyinjection.SIMCard
import javax.inject.Inject

class SmartPhone @Inject constructor(val battery: Battery, val simCard: SIMCard, val memoryCard: MemoryCard) {

    init {
        Log.i("MYTAG", "SmartPhone Constructed")
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailablity()
    }

    fun makeACallWithRecording() {
        Log.i("MYTAG", "Calling.....")
    }
}