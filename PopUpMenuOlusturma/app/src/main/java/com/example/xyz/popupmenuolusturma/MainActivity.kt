package com.example.xyz.popupmenuolusturma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonMenuAc.setOnClickListener {

            val popup = PopupMenu(this@MainActivity,buttonMenuAc)

            popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)
            popup.show()



            popup.setOnMenuItemClickListener {  item->

                when(item.itemId){

                    R.id.action_sil ->{
                        Toast.makeText(applicationContext,"Sil Seçidi",Toast.LENGTH_SHORT).show()
                        true
                    }

                    R.id.action_duzenle ->{
                        Toast.makeText(applicationContext,"Düzenle Seçidi",Toast.LENGTH_SHORT).show()
                        true

                    }else -> {
                   false
                    }
                }
            }
        }
    }
}