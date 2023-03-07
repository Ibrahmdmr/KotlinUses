package com.example.xyz.progressbarsliderratingbarkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.channels.SeekableByteChannel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonBasla.setOnClickListener {

            progressBar.visibility = View.VISIBLE

        }

        buttonBasla.setOnClickListener {

            progressBar.visibility = View.INVISIBLE

        }

        slider1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(seekBar: SeekBar?, ilerleme: Int, fromUser: Boolean) {
                textView.text = "Sonuç: $ilerleme"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        buttonGoster.setOnClickListener {

            val gelenIlerleme = slider1.progress
            val gelenOylama = ratingBar.rating

            Log.e("İlerleme",gelenIlerleme.toString())
            Log.e("Oylama",gelenOylama.toString())

        }
    }
}
