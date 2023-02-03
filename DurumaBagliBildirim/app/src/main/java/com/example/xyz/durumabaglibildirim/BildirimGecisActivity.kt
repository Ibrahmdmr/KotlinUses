package com.example.xyz.durumabaglibildirim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.xyz.durumabaglibildirim.databinding.ActivityBildirimGecisBinding

class BildirimGecisActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivityBildirimGecisBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityBildirimGecisBinding.inflate(layoutInflater)
        setContentView(tasarim.root)




    }
}