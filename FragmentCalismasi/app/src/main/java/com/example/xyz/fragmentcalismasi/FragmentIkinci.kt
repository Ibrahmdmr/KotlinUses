package com.example.xyz.fragmentcalismasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragmentikinci.*
import kotlinx.android.synthetic.main.fragmentikinci.view.*

class FragmentIkinci : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragmentikinci,container,false)

       rootView.buttonYap.setOnClickListener {

          rootView.textViewCikti.text = "BAŞARILI :)"

       }

        return rootView

    }

}