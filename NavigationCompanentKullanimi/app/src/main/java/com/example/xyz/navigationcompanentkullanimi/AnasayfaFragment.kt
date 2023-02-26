package com.example.xyz.navigationcompanentkullanimi

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_anasayfa.*
import kotlinx.android.synthetic.main.fragment_anasayfa.view.*

class AnasayfaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val tasarim = inflater.inflate(R.layout.fragment_anasayfa, container, false)

        tasarim.buttonBasla.setOnClickListener {
           //val kisi = Kisiler(kisi_no =1,kisi_ad ="Mehmet")
        //    val gecis = AnasayfaFragmentDirections.oyunEkraninaGecis(ad ="Ahmet",yas =18,boy =1.78f,bekarMi =true,kisi)

            Navigation.findNavController(it).navigate(R.id.oyunEkraninaGecis)

        }

        return tasarim

    }

}