package com.alamin.dependencyinjection

import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {
    @Provides
    fun provideMemoryCard(): MemoryCard{
        return MemoryCard()
    }
}