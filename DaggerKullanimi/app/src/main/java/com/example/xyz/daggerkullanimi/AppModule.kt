package com.example.xyz.daggerkullanimi

import com.google.android.datatransport.runtime.dagger.Module
import com.google.android.datatransport.runtime.dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideAdres() : Adres{
        return Adres("Osmangazi/BURSA")
    }
}