package com.example.xyz.countdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.xyz.countdowntimer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


        tasarim.buttonBasla.setOnClickListener {

            val sayici = object : CountDownTimer(31000,1000){  // 30000 yerine 31000 30' dan başlasın diye

                override fun onTick(cdt: Long) {
                    tasarim.textViewCikti.text = "Kalan Süre : ${cdt / 1000} sn"
                }

                override fun onFinish() {
                    tasarim.textViewCikti.text = "Bitti"
                }
            }
            sayici.start()
        }
    }
}