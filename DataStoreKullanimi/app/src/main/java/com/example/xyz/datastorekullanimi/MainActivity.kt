package com.example.xyz.datastorekullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.SimpleAdapter
import com.example.xyz.datastorekullanimi.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = ActivityMainBinding.inflate(LayoutInflater.from(this))

        setContentView(tasarim.root)


        val ap = AppPref(this)

        val job = CoroutineScope(Dispatchers.Main).launch {

            ap.kayitAd("Ahmet")
            ap.kayitYas(24)
            ap.kayitBoy(1.79)
            ap.kayitBekar(true)

            val liste = HashSet<String>()
            liste.add("Zeynep")
            liste.add("Mehmet")

            ap.kayitArkadasListe(liste)


           // ap.silAd()

            val gelenAd = ap.okuAd()
            val gelenYas = ap.okuYas()
            val gelenBoy = ap.okuBoy()
            val gelenBekar = ap.okuBekar()

            val gelenArkadasListe = ap.okuArkadasListe()

            Log.e("Gelen Ad",gelenAd)
            Log.e("Gelen Yas",gelenYas.toString())
            Log.e("Gelen Boy",gelenBoy.toString())
            Log.e("Gelen Bekar",gelenBekar.toString())


            val gelenListe = ap.okuArkadasListe()

            if (gelenListe != null){
                for (a in gelenListe){
                    Log.e("Gelen Arkadaş",a)

                }
            }

            var gelenSayac = ap.okuSayac()
            ap.kayitSayac(gelenSayac++)

            tasarim.textViewSayac.text = "Açılış Sayısı : $gelenSayac"

        }


    }
}