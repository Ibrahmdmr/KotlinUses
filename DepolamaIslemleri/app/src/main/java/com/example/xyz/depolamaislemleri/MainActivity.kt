package com.example.xyz.depolamaislemleri

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.io.*
import java.lang.StringBuilder
import kotlin.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonYaz.setOnClickListener {

           // hariciYaz()
            dahiliYaz()
        }

        buttonOku.setOnClickListener {

           // hariciOku()
            dahiliOku()
        }

        buttonSil.setOnClickListener {

           // hariciSil()
            dahiliSil()
        }
    }

    fun hariciYaz(){

        try {
            val yol = applicationContext.getExternalFilesDir(null)?.absolutePath
            val dosya = File(yol, "dosya.txt")

            if (!dosya.exists()){
                dosya.createNewFile()
            }

            val fw = FileWriter(dosya)
            val yazici = BufferedWriter(fw)

            yazici.write(editTextGirdi.text.toString())

            yazici.flush()
            yazici.close()
            fw.close()

            editTextGirdi.setText("")

        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    fun hariciOku(){

        textViewSonuc.setText("")

        try {
            val yol = applicationContext.getExternalFilesDir(null)?.absolutePath
            val dosya = File(yol, "dosya.txt")

            val fr = FileReader(dosya)
            val okuyucu = BufferedReader(fr)

            val sb = StringBuilder()

            var satir:String ? = null

            while ({satir = okuyucu.readLine();satir} () != null ){
                sb.append("$satir\n")
            }

            okuyucu.close()
            fr.close()

            textViewSonuc.text = sb.toString()

        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    fun hariciSil(){

        val yol = applicationContext.getExternalFilesDir(null)?.absolutePath
        val dosya = File(yol, "dosya.txt")

        dosya.delete()

        textViewSonuc.setText("")
    }


    fun dahiliYaz(){

        try {

            val fo = openFileOutput("Dosya.txt", Context.MODE_PRIVATE)
            val yazici = OutputStreamWriter(fo)

            yazici.write(editTextGirdi.text.toString())
            yazici.close()

            editTextGirdi.setText("")
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    fun dahiliOku(){
        try {
        val fi = openFileInput("Dosya.txt")
            val isr = InputStreamReader(fi)

            val okuyucu = BufferedReader(isr)

            val sb = StringBuilder()

            var satir:String ? = null

            while ({satir = okuyucu.readLine();satir} () != null ){
                sb.append("$satir\n")
            }

            okuyucu.close()

            textViewSonuc.text = sb.toString()

        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    fun dahiliSil(){
        val  yol = filesDir
        val dosya = File(yol,"Dosya.txt")

        dosya.delete()

        textViewSonuc.setText("")
    }
}