package com.example.xyz.floatinglabel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonYap.setOnClickListener {
            val ad = edittextAd.text.toString().trim()
            val tel = edittextTel.text.toString().trim()        // trim() = boşlukları görmezden gel

            if (TextUtils.isEmpty(ad)){
                Toast.makeText(applicationContext,"Ad Boş",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (TextUtils.isEmpty(tel)){
                Toast.makeText(applicationContext,"Tel Boş",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (tel.length < 6){
                Toast.makeText(applicationContext,"Tel en az 6 hane olmalıdır",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(applicationContext,"$ad - $tel",Toast.LENGTH_SHORT).show()
        }
    }
}