package com.example.xyz.recyclerviewkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var ulkelerList:ArrayList<Ulkeler>
    private lateinit var adapter:RVAdepter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rv.setHasFixedSize(true)
       rv.layoutManager = LinearLayoutManager(this)
       // rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
       //rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        val u1 = Ulkeler(1,"Türkiye")
        val u2 = Ulkeler(2,"İtalya")
        val u3 = Ulkeler(3,"İspanya")
        val u4 = Ulkeler(4,"Japonya")

        ulkelerList = ArrayList<Ulkeler>()
        ulkelerList.add(u1)
        ulkelerList.add(u2)
        ulkelerList.add(u3)
        ulkelerList.add(u4)


        adapter = RVAdepter(this,ulkelerList)

        rv.adapter = adapter


    }
}