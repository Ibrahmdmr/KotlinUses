package com.example.xyz.contextkullanimi

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentDeneme : Fragment() {


    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {

        Toast.makeText(activity,"Merhaba", Toast.LENGTH_SHORT).show()

        return super.onCreateView(inflater, container, savedInstanceState)
    }

}