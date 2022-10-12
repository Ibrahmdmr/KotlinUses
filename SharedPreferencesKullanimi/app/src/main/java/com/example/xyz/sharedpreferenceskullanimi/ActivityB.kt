package com.example.xyz.sharedpreferenceskullanimi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)




        val sp = getSharedPreferences("KisilerListesi", Context.MODE_PRIVATE)

        val ad = sp.getString("ad","isim yok")
        val yas = sp.getInt("yas",0)
        val boy = sp.getFloat("boy",0.0f)
        val bekarMi = sp.getBoolean("bekarMi",false)

        val liste = sp.getStringSet("arkadasListesi",null)

        Log.e("Ad",ad.toString())
        Log.e("Yaş",yas.toString())
        Log.e("Boy",boy.toString())
        Log.e("Bekar Mı?",bekarMi.toString())

        if (liste !=null){

            for (a in liste){
                Log.e("Arkadaş",a)
            }
        }
    }
}