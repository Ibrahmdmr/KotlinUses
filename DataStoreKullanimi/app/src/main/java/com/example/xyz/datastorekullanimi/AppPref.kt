package com.example.xyz.datastorekullanimi

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

class AppPref(var context: Context) {

    val Context.ds :DataStore<Preferences> by preferencesDataStore("bilgiler")

    companion object{
        val ad_key = stringPreferencesKey("ad") // buraya dikkat!!
        val yas_key = intPreferencesKey("yas")
        val boy_key = doublePreferencesKey("boy")
        val bekar_key = booleanPreferencesKey("bekar")
        val arkadas_list_key = stringSetPreferencesKey("liste")

        val sayac_key = intPreferencesKey("sayac")
    }

    suspend fun kayitAd(ad:String){                    // kayıt
        context.ds.edit {
            it[ad_key] = ad
        }
    }

    suspend fun okuAd():String{                        //okuma
        val p = context.ds.data.first()
        return p[ad_key] ?: "isim yok"
    }

    suspend fun silAd(){                               //silme
        context.ds.edit {
            it.remove(ad_key)
        }
    }

    suspend fun kayitYas(yas:Int){
        context.ds.edit {
            it[yas_key] = yas
        }
    }

    suspend fun okuYas():Int{
        val p = context.ds.data.first()
        return p[yas_key] ?: 0
    }

    suspend fun silYas(){
        context.ds.edit {
            it.remove(yas_key)
        }
    }

    suspend fun kayitBoy(boy:Double){
        context.ds.edit {
            it[boy_key] = boy
        }
    }

    suspend fun okuBoy():Double{
        val p = context.ds.data.first()
        return p[boy_key] ?: 0.0
    }

    suspend fun silBoy(){
        context.ds.edit {
            it.remove(boy_key)
        }
    }

    suspend fun kayitBekar(bekar:Boolean){
        context.ds.edit {
            it[bekar_key] = bekar
        }
    }

    suspend fun okuBekar():Boolean{
        val p = context.ds.data.first()
        return p[bekar_key] ?: false
    }

    suspend fun silBwekar(){
        context.ds.edit {
            it.remove(bekar_key)
        }
    }

    suspend fun kayitArkadasListe(liste:Set<String>){
        context.ds.edit {
            it[arkadas_list_key] = liste
        }
    }

    suspend fun okuArkadasListe():Set<String> ? {
        val p = context.ds.data.first()
        return p[arkadas_list_key]
    }

    suspend fun silArkadasListe(){
        context.ds.edit {
            it.remove(arkadas_list_key)
        }
    }

    suspend fun kayitSayac(sayac:Int){
        context.ds.edit {
            it[sayac_key] = sayac
         }
    }

    suspend fun okuSayac():Int{
        val s = context.ds.data.first()
        return s[sayac_key] ?: 0
    }

    suspend fun silSayac(){
        context.ds.edit {
            it.remove(sayac_key)
        }
    }

}