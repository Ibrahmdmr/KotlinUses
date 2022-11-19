package com.example.xyz.workmanaggerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.work.*
import com.example.xyz.workmanaggerkullanimi.databinding.ActivityMainBinding
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonYap.setOnClickListener {

          /*  val calismaKosulu = Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build()


            val istek = OneTimeWorkRequestBuilder<MyWorker>()
                .setInitialDelay(10,TimeUnit.SECONDS)  // 10 saniye geç çalışır.
                .setConstraints(calismaKosulu)
                .build()

            WorkManager.getInstance(this).enqueue(istek)  */

            val istek = PeriodicWorkRequestBuilder<MyWorkerBildirim>(15,TimeUnit.MINUTES)
                .setInitialDelay(10,TimeUnit.SECONDS)  // 10 saniye geç çalışır.
                .build()

            WorkManager.getInstance(this).enqueue(istek)

            WorkManager.getInstance(this).getWorkInfoByIdLiveData(istek.id)
                .observe(this) {
                    val durum = it.state.name
                    Log.e("Arkaplan İşlem Durum",durum)
                }
        }




    }
}