package com.example.xyz.smsyakalama

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.telephony.SmsMessage
import android.widget.Toast

class SmsYakalayici : BroadcastReceiver() {          // bölüm 17 251.ders

    override fun onReceive(context: Context?, intent: Intent?) {

        val b = intent?.extras

        if (b != null){

            val pdusObj = b.get("pdus") as Array<*>

            for (i in pdusObj.indices){

                val guncelMesaj:SmsMessage

                guncelMesaj = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){

                    val format = b.getString("format")
                    SmsMessage.createFromPdu(pdusObj[i] as ByteArray,format)

                }else{
                    SmsMessage.createFromPdu(pdusObj[i] as ByteArray)
                }

                val telNo = guncelMesaj.displayOriginatingAddress
                val mesaj = guncelMesaj.displayMessageBody

                Toast.makeText(context,"$telNo - $mesaj",Toast.LENGTH_SHORT).show()
            }
        }
    }
}