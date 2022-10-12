package com.example.xyz.sharedpreferenceskullanimi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sp = getSharedPreferences("KisilerListesi",Context.MODE_PRIVATE)

        val editor = sp.edit()

        editor.remove("ad")

        editor.commit()

      /*    editor.putString("ad","Ahmet")
            editor.putInt("yas",19)
            editor.putFloat("boy",1.77f)
            editor.putBoolean("bekarMi",true)

        val arkadasListesi = HashSet<String>()
        arkadasListesi.add("Zeynep")
        arkadasListesi.add("Ali")
        arkadasListesi.add("Ece")

        editor.putStringSet("arkadasListesi",arkadasListesi)

        editor.commit()       */


        buttonGoToB.setOnClickListener {

            val gecis = Intent(this@MainActivity,ActivityB::class.java)
            startActivity(gecis)
        }
    }
}