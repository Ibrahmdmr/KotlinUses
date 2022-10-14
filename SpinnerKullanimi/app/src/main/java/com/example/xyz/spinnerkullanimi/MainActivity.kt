package com.example.xyz.spinnerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val ulkeler = ArrayList<String>()

    private lateinit var veriAdeptoru:ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ulkeler.add("Türkiye")
        ulkeler.add("İspanya")
        ulkeler.add("Japonya")
        ulkeler.add("Çin")
        ulkeler.add("İtalya")
        ulkeler.add("Almanya")
        ulkeler.add("Ukrayna")

        veriAdeptoru = ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,ulkeler)

        spinner.adapter = veriAdeptoru


        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, indeks: Int, id: Long) {

                Toast.makeText(applicationContext,"Seçilen Ülke : ${ulkeler[indeks]}",Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        buttonGoster.setOnClickListener {

            Toast.makeText(applicationContext,"Ülke : ${ulkeler[spinner.selectedItemPosition]}",Toast.LENGTH_SHORT).show()

        }

    }
}