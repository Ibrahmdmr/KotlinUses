package com.example.xyz.daggerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var kargo: Kargo
    @Inject
    lateinit var internet: Internet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       // DaggerAppComponent.builder.build.inject(this)   // DaggerAppComponent   dagger'in sorunu


        kargo.gonder()


        internet.basvuruYap()

    }
}