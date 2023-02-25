package com.example.xyz.hazirveritabanikullanimi

class Kategorilerdao {

    fun tumKategoriler(vt:VeritabaniYardimcisi) : ArrayList<Kategoriler>{

        val kategoriListe = ArrayList<Kategoriler>()

        val db = vt.writableDatabase

        val cursor = db.rawQuery("SELECT * FROM kategoriler",null)

        while (cursor.moveToNext()){
            val kategori = Kategoriler(cursor.getInt(cursor.getColumnIndex("kategori_id"))
            ,cursor.getString(cursor.getColumnIndex("kategori_ad")))

            kategoriListe.add(kategori)
        }
        return kategoriListe
    }



}