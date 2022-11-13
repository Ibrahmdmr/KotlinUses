package com.example.xyz.timedatepickerkullanimi

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextTime.setOnClickListener {

            val calendar = Calendar.getInstance()

            val hour = calendar.get(Calendar.HOUR)    //saat
            val minute = calendar.get(Calendar.MINUTE) //dakika

            val timePicker = TimePickerDialog(this@MainActivity,TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->

                editTextTime.setText("$hour : $minute")

            },hour,minute,true)

            timePicker.setTitle("Saat Seçiniz")
            timePicker.setButton(TimePickerDialog.BUTTON_POSITIVE,"AYARLA",timePicker)
            timePicker.setButton(TimePickerDialog.BUTTON_NEGATIVE,"İPTAL",timePicker)

            timePicker.show()

        }

        editTextDate.setOnClickListener {

            val calendar = Calendar.getInstance()

            val year = calendar.get(Calendar.YEAR) //yıl
            val month = calendar.get(Calendar.MONTH) //ay
            val day = calendar.get(Calendar.DAY_OF_MONTH) //ay'ın günü

            val datePicker = DatePickerDialog(this@MainActivity,DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->

                editTextDate.setText("$day/${month+1}/$year")

            },year,month,day)

            datePicker.setTitle("Tarih Seçiniz")
            datePicker.setButton(DatePickerDialog.BUTTON_POSITIVE,"AYARLA",datePicker)
            datePicker.setButton(DatePickerDialog.BUTTON_NEGATIVE,"İPTAL",datePicker)

            datePicker.show()
        }
    }
}