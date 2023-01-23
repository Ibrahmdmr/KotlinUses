package com.example.xyz.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_c.*

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)


        buttonGoToD.setOnClickListener {

            startActivity(Intent(this@ActivityC,ActivityD::class.java))

        }

    }
}