package com.example.xyz.daggerkullanimi

import com.google.android.datatransport.runtime.dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}