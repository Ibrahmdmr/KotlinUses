package com.example.xyz.roomkullanimi

import androidx.room.*

@Dao
interface KisilerDao {

    @Query("SELECT * FROM kisiler")
    suspend fun tumKisiler() : List<Kisiler>


    @Insert
    suspend fun kisiEkle(kisi:Kisiler)


    @Update
    suspend fun kisiGuncelle(kisi:Kisiler)


    @Delete
    suspend fun kisiSil(kisi:Kisiler)


    @Query("SELECT * FROM kisiler ORDER BY RANDOM() LIMIT 1")
    suspend fun rastegele1KisiGetir() : List<Kisiler>


    @Query("SELECT * FROM kisiler WHERE kisi_ad LIKE '%' || :aramaKelime  ||  '%'")
    suspend fun kisiAra(aramaKelime:String) : List<Kisiler>


    @Query("SELECT * FROM kisiler WHERE kisi_id=:kisi_id")
    suspend fun kisiGetir(kisi_id:Int) : Kisiler


    @Query("SELECT count(*) FROM kisiler WHERE kisi_ad=:kisi_ad")
    suspend fun kayitKontrol(kisi_ad:String) : Int

}