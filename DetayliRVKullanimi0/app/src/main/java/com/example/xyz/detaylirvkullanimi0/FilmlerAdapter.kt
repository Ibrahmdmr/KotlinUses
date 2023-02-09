package com.example.xyz.detaylirvkullanimi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.xyz.detaylirvkullanimi0.R

class FilmlerAdapter (private var mContext:Context,private var FilmlerListesi:List<Filmler>)
    : RecyclerView.Adapter<FilmlerAdapter.CardTasarimNesneleriTutucu>(){

    inner class CardTasarimNesneleriTutucu(view:View):RecyclerView.ViewHolder(view){

        var imageViewFilmResim:ImageView
        var textViewFilmBaslik:TextView
        var textViewFilmFiyat:TextView
        var buttonSepeteEkle:Button

        init {
            imageViewFilmResim = view.findViewById(R.id.imageViewFilmResim)
            textViewFilmBaslik = view.findViewById(R.id.textViewFilmBaslik)
            textViewFilmFiyat = view.findViewById(R.id.textViewFilmFiyat)
            buttonSepeteEkle = view.findViewById(R.id.buttonSepeteEkle)
        }
    }

    override fun getItemCount(): Int {
        return FilmlerListesi.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneleriTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_film_tasarim,parent)

        return CardTasarimNesneleriTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriTutucu, position: Int) {
        val film = FilmlerListesi[position]

        holder.textViewFilmBaslik.text = film.film_ad
        holder.textViewFilmFiyat.text = "${film.film_fiyat} TL"

        holder.imageViewFilmResim.setImageResource(mContext.resources.getIdentifier(
            film.film_resim_ad,"drawable",mContext.packageName))

        holder.buttonSepeteEkle.setOnClickListener {

            Toast.makeText(mContext,"${film.film_ad} sepete eklendi",Toast.LENGTH_SHORT).show()

        }
    }

}