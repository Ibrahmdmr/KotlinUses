package com.example.xyz.allertviewkullanimi

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                                                          // Alert Kullanimi

        buttonNormal.setOnClickListener {

            val ad = AlertDialog.Builder(this@MainActivity)

            ad.setTitle("Başlık")
            ad.setMessage("Mesaj")
            val icon = ad.setIcon(R.drawable.resim)

            ad.setPositiveButton("Tamam",DialogInterface.OnClickListener { dialog, id ->
                Toast.makeText(applicationContext, "Tamam Tıklandı", Toast.LENGTH_SHORT).show()
            })

            ad.setNegativeButton("İptal",DialogInterface.OnClickListener { dialog, i ->
                Toast.makeText(applicationContext, "İptal Tıklandı", Toast.LENGTH_SHORT).show()
            })
            ad.create().show()
        }


        buttonOzel.setOnClickListener {

            val tasarim = layoutInflater.inflate(R.layout.alert_tasarim,null)

            val editTextAlert = tasarim.findViewById(R.id.editTextAlert) as EditText

            val ad = AlertDialog.Builder(this@MainActivity)

            ad.setTitle("Başlık")
            ad.setMessage("Mesaj")
            val icon = ad.setIcon(R.drawable.resim)

            ad.setView(tasarim)

            ad.setPositiveButton("Kaydet",DialogInterface.OnClickListener { dialog, id ->
                val alinanVeri = editTextAlert.text.toString()

                Toast.makeText(applicationContext, "Alınan Veri : $alinanVeri", Toast.LENGTH_SHORT).show()
            })

            ad.setNegativeButton("İptal",DialogInterface.OnClickListener { dialog, i ->
                Toast.makeText(applicationContext, "İptal Tıklandı", Toast.LENGTH_SHORT).show()
            })
            ad.create().show()
        }

    }
}