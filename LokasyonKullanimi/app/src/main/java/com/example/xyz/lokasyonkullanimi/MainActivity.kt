package com.example.xyz.lokasyonkullanimi

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.xyz.lokasyonkullanimi.databinding.ActivityMainBinding
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.Task
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    private var izinKontrol = 0
    private lateinit var flpc: FusedLocationProviderClient
    private lateinit var locationTask: Task<Location>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


        flpc = LocationServices.getFusedLocationProviderClient(this)


        tasarim.buttonKonumAl.setOnClickListener {
            izinKontrol = ContextCompat.checkSelfPermission(this,android.Manifest.permission.ACCESS_FINE_LOCATION)

            if (izinKontrol != PackageManager.PERMISSION_GRANTED) { // izin onaylanmamışsa
                ActivityCompat.requestPermissions(
                    this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), 100)
            }else{ // izin onaylanmışsa
                locationTask = flpc.lastLocation
                konumBilgisiAl()

            }
        }
    }

    fun konumBilgisiAl(){
        locationTask.addOnSuccessListener {
            if (it != null){
                tasarim.textViewEnlem.text = "Enlem : ${it.latitude}"
                tasarim.textViewBoylam.text = "Boylam : ${it.longitude}"
            }else{
                tasarim.textViewEnlem.text = "Enlem : Alınamadı"
                tasarim.textViewBoylam.text = "Boylam : Alınamadı"
            }
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (requestCode == 100){

            izinKontrol = ContextCompat.checkSelfPermission(this,android.Manifest.permission.ACCESS_FINE_LOCATION)

            if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(applicationContext,"İzin kabul edildi",Toast.LENGTH_SHORT).show()

                locationTask = flpc.lastLocation
                konumBilgisiAl()
            }else{
                Toast.makeText(applicationContext,"İzin reddedildi",Toast.LENGTH_SHORT).show()
            }
        }
    }

}