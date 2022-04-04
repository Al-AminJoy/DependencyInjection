package com.alamin.dependencyinjection

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val size: Int) {
    @Provides
    fun provideMemoryCard(): MemoryCard{
        Log.i("MYTAG","Size : $size")
        return MemoryCard()
    }
}