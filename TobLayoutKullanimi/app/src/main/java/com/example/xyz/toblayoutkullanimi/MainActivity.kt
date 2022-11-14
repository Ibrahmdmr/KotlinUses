package com.example.xyz.toblayoutkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val FragmentListesi = ArrayList<Fragment>()
    private val FragmentBaslikListesi = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        FragmentListesi.add(FragmentBirinci())
        FragmentListesi.add(FragmentIkinci())
        FragmentListesi.add(FragmentUcuncu())

       val adapter = MyViewPagerAdapter(this)
        viewpager2.adapter = adapter

        FragmentBaslikListesi.add("Bir")
        FragmentBaslikListesi.add("İki")
        FragmentBaslikListesi.add("Üç")

        TabLayoutMediator(tablayout,viewpager2){tab, position ->
            tab.setText(FragmentBaslikListesi[position])
        }.attach()

        tablayout.getTabAt(0)!!.setIcon(R.drawable.resim1)
        tablayout.getTabAt(1)!!.setIcon(R.drawable.resim2)
        tablayout.getTabAt(2)!!.setIcon(R.drawable.resim3)

    }

    inner class MyViewPagerAdapter(fragmentActivity:FragmentActivity):FragmentStateAdapter(fragmentActivity){

        override fun getItemCount(): Int {
            return FragmentListesi.size
        }

        override fun createFragment(position: Int): Fragment {
            return FragmentListesi[position]

        }

    }
}