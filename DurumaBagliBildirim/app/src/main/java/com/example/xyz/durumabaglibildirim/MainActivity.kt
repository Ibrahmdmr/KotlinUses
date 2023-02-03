package com.example.xyz.durumabaglibildirim

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import com.example.xyz.durumabaglibildirim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


        tasarim.buttonBildir.setOnClickListener {

            val builder : NotificationCompat.Builder
            val bildirimYoneticisi = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            val intent = Intent(this,BildirimGecisActivity::class.java)
            val gidilecekIntent = PendingIntent.getActivity(this,1,intent,PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

                val kanalId = "kanalId"
                val kanalAd = "kanalAd"
                val kanalTanitim = "kanalTanitim"
                val kanalOncelligi = NotificationManager.IMPORTANCE_HIGH

                var kanal : NotificationChannel? = bildirimYoneticisi.getNotificationChannel(kanalId)

                if (kanal == null){
                    kanal = NotificationChannel(kanalId,kanalAd,kanalOncelligi)
                    kanal.description = kanalTanitim
                    bildirimYoneticisi.createNotificationChannel(kanal)
                }

                builder = NotificationCompat.Builder(this,kanalId)

                builder.setContentTitle("Başlık")
                    .setContentText("İçerik")
                    .setSmallIcon(R.drawable.resim)
                    .setContentIntent(gidilecekIntent)
                    .setAutoCancel(true)   // tıkladığımızda kaybolması için

            }else{
                builder = NotificationCompat.Builder(this)

                builder.setContentTitle("Başlık")
                    .setContentText("İçerik")
                    .setSmallIcon(R.drawable.resim)
                    .setContentIntent(gidilecekIntent)
                    .setAutoCancel(true)
                    .priority = Notification.PRIORITY_HIGH
            }

            bildirimYoneticisi.notify(1,builder.build()) // bildirimi göstermesi için

        }

    }
}