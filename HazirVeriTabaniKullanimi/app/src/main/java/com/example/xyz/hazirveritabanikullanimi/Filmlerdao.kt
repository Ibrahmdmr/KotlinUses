package com.example.xyz.hazirveritabanikullanimi

class Filmlerdao {

    //SELECT * FROM filmler,kategoriler,yonetmenler WHERE filmler.kategori_id=kategoriler.kategori_id AND filmler.yonetmen_id=yonetmenler.yonetmen_id AND filmler.kategori_id=2

    fun tumFilmler(vt:VeritabaniYardimcisi,kategori_id:Int) : ArrayList<Filmler>{

        val filmlerListe = ArrayList<Filmler>()

        val db = vt.writableDatabase

        val cursor = db.rawQuery("SELECT * FROM filmler,kategoriler,yonetmenler WHERE filmler.kategori_id=kategoriler.kategori_id AND filmler.yonetmen_id=yonetmenler.yonetmen_id AND filmler.kategori_id=$kategori_id",null)

        while (cursor.moveToNext()){
            val kategori = Kategoriler(cursor.getInt(cursor.getColumnIndex("kategori_id"))
                ,cursor.getString(cursor.getColumnIndex("kategori_ad")))

            val yonetmen = Yonetmenler(cursor.getInt(cursor.getColumnIndex("yonetmen_id"))
                ,cursor.getString(cursor.getColumnIndex("yonetmen_ad")))

            val film = Filmler(cursor.getInt(cursor.getColumnIndex("film_id"))
                ,cursor.getString(cursor.getColumnIndex("film_ad"))
            ,cursor.getInt(cursor.getColumnIndex("film_yil"))
                ,cursor.getString(cursor.getColumnIndex("film_resim")),kategori,yonetmen)

            filmlerListe.add(film)
        }
        return filmlerListe
    }


}