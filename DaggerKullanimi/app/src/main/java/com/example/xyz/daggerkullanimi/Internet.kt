package com.example.xyz.daggerkullanimi

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor (var adres: Adres) {

    fun basvuruYap(){
        Log.e("Sonuç","Başvuru ${adres.adresBilgisi} adresi için yapıldı.")
    }

}