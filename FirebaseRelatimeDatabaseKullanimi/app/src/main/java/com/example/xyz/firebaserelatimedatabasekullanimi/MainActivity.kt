package com.example.xyz.firebaserelatimedatabasekullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val database = FirebaseDatabase.getInstance() // izin alma

        val refKisiler = database.getReference("kisiler") // tablo adı

       // val kisi = Kisiler("Meltem",13) // kisi

       // refKisiler.push().setValue(kisi) // kisiyi ekleme

       // refKisiler.child("-NAjGd2ZW1FuJgOcy9o0").removeValue()  // silme işlemi

       /* val updetInfo = HashMap<String,Any>()    // güncelleme işlemi

        updetInfo["kisi_ad"] = "Yeni Zeynep"          // güncelleme işlemi
        updetInfo["kisi_yas"] = 100                // güncelleme işlemi

        refKisiler.child("-NAjAx6OgJlJedqfOmQE").updateChildren(updetInfo) */   // güncelleme işlemi


        /*refKisiler.addValueEventListener(object : ValueEventListener{  // verileri okuma  // refKisiler!!

            override fun onDataChange(ds: DataSnapshot) {

                for (p in ds.children) {

                    val kisi = p.getValue(Kisiler::class.java)

                    if (kisi != null) {  // kisi null yaniboş değilse çalışacak kod

                        val key = p.key

                        Log.e("*********","***********")
                        Log.e("kisi_key",key.toString())
                        Log.e("kisi_ad",kisi.kisi_ad.toString())
                        Log.e("kisi_yas",kisi.kisi_yas.toString())
                    }
                }
            }
            override fun onCancelled(error: DatabaseError) {
            }
        })                       */                          // verileri okuma


        // val sorgu = refKisiler.orderByChild("kisi_ad").equalTo("Ahmet") // kisi_ad'ı Ahmet olanları getir

       // val sorgu = refKisiler.limitToFirst(2) // ilk 2 veriyi getirir

       // val sorgu = refKisiler.limitToLast(2) // son 2 veriyi getirir

        val sorgu = refKisiler.orderByChild("kisi_yas").startAt(10.0).endAt(30.0) // 10 ile 30 arasındaki yaşlara sahip verileri getirir

        sorgu.addValueEventListener(object : ValueEventListener{    // sorgu !!

            override fun onDataChange(ds: DataSnapshot) {

                for (p in ds.children) {

                    val kisi = p.getValue(Kisiler::class.java)

                    if (kisi != null) {  // kisi null yaniboş değilse çalışacak kod

                        val key = p.key

                        Log.e("*********","***********")
                        Log.e("kisi_key",key.toString())
                        Log.e("kisi_ad",kisi.kisi_ad.toString())
                        Log.e("kisi_yas",kisi.kisi_yas.toString())
                    }
                }
            }
            override fun onCancelled(error: DatabaseError) {
            }
        })

    }
}