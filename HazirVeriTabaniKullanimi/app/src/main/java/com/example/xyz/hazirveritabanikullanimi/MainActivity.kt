package com.example.xyz.hazirveritabanikullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.info.sqlitekullanimihazirveritabani.DatabaseCopyHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        veritabaniKopyala()

        val vt = VeritabaniYardimcisi(this)

       // val liste = Kategorilerdao().tumKategoriler(vt)

        val liste = Filmlerdao().tumFilmler(vt,2)
        for (f in liste){
            Log.e("Filmler id",f.film_id.toString())
            Log.e("Filmler ad",f.film_ad)
            Log.e("Filmler Yıl",f.film_yil.toString())
            Log.e("Filmler Resim",f.film_resim)
            Log.e("FilmKategori id",f.kategoriler.kategori_id.toString())
            Log.e("FilmKategori ad",f.kategoriler.kategori_ad)
            Log.e("FilmYönetmen id",f.yonetmenler.yonetmen_id.toString())
            Log.e("FilmYönetmen ad",f.yonetmenler.yonetmen_ad)
        }

    }

    fun veritabaniKopyala(){

        val db = DatabaseCopyHelper(this)

        try {
            db.createDataBase()
        }catch (e:Exception){
            e.printStackTrace()
        }


        try {
            db.openDataBase()
        }catch (e:Exception){
            e.printStackTrace()
        }

    }

}