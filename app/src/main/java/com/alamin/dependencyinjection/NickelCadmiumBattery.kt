package com.alamin.dependencyinjection

import android.util.Log
import javax.inject.Inject

class NickelCadmiumBattery @Inject constructor(): Battery {
    override fun getPower() {
        Log.i("MYTAG","Battery getting power from NCB")
    }
}