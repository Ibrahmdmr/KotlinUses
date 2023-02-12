package com.example.xyz.snackbarcalismasi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonNormal.setOnClickListener { abc ->    // abc buttonNormal'i temsil ediyo

            Snackbar.make(abc,"Merhaba",Snackbar.LENGTH_SHORT).show()

        }

        buttonGeriDonus.setOnClickListener { x ->
            Snackbar.make(x,"Mesaj Silinsin mi?",Snackbar.LENGTH_SHORT)
                .setAction("EVET"){ y ->

                    Snackbar.make(y,"Mesaj Silindi",Snackbar.LENGTH_SHORT).show()
                }
                .show()
        }

        buttonOzel.setOnClickListener { z ->

            val sb = Snackbar.make(z,"İnternet Bağlantısı Yok!",Snackbar.LENGTH_LONG)

            sb.setAction("TEKRAR DENE"){ nesne ->
              val sb2 = Snackbar.make(nesne,"İnternet Bağlantısı Sağlandı",Snackbar.LENGTH_LONG)
                sb2.setTextColor(Color.BLUE)
                sb2.setBackgroundTint(Color.WHITE)

                sb2.show()
            }

            sb.setActionTextColor(Color.RED)
            sb.setTextColor(Color.BLUE)
            sb.setBackgroundTint(Color.WHITE)

            sb.show()
        }
    }
}