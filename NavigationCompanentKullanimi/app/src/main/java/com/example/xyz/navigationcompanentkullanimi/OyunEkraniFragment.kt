package com.example.xyz.navigationcompanentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_oyun_ekrani.view.*

class OyunEkraniFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val tasarim = inflater.inflate(R.layout.fragment_oyun_ekrani, container, false)

      //  val bundle:OyunEkraniFragment by navArgs()             // navArgs() sorunu :/

    //    val gelenAd = bundle.ad
    //    val gelenYas = bundle.yas
   //     val gelenBoy = bundle.boy
    //    val gelenBekarMi = bundle.bekarMi
    //    val gelenNesne = bundle.nesne

    //    Log.e("Gelen Ad: "gelenAd)
    //    Log.e("Gelen Yas: "gelenYas.toString())
    //    Log.e("Gelen Boy: "gelenBoy.toString())
    //    Log.e("Gelen Bekar mı: "gelenBekarMi.toString())
    //    Log.e("Gelen Kişi No: "gelenNesne.kisi_no.toString())
        //    Log.e("Gelen Kişi Ad: "gelenNesne.kisi_ad)


        tasarim.buttonBitir.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.sonucEkraninaGecis)   // it = buttonBitir demek

        }

        return tasarim

    }

}