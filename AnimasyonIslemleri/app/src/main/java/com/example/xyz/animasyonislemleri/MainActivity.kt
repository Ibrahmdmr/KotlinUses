package com.example.xyz.animasyonislemleri

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.view.animation.OvershootInterpolator
import android.widget.Toast
import com.example.xyz.animasyonislemleri.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        //buttonAsagıdanEkranaGirisAnimasyonu()
        //yaziSagdanEkranaGirisAnimasyonu()
        //resimSoldanEkranaGirisAnimasyonu()

        tasarim.button.setOnClickListener {
            //alphaAnimasyonu()
            //scaleAnimasyonu()
            //rotateAnimasyonu()
            //translationAnimasyonu()
            //gecikmeOzelligi()
            //ivmeOzelligi()
            //tekrarOzelligi()
            //cokluAnimasyon()
            ardisikAnimasyon()
        }

    }

    fun ardisikAnimasyon(){  //
        val a = ObjectAnimator.ofFloat(tasarim.resim,"alpha",1.0f,0.0f)
        val sX = ObjectAnimator.ofFloat(tasarim.resim,"scaleX",0.0f,2.0f)
        val sY = ObjectAnimator.ofFloat(tasarim.resim,"scaleY",0.0f,3.0f)

        val coklu = AnimatorSet().apply { //
            duration = 1000  //
            playSequentially(sX,sY,a)  // en baştan teker teker sırayla uygular
        }
        coklu.start()
    }

    fun cokluAnimasyon(){  //
        val a = ObjectAnimator.ofFloat(tasarim.resim,"alpha",1.0f,0.0f)
        val sX = ObjectAnimator.ofFloat(tasarim.resim,"scaleX",0.0f,2.0f)
        val sY = ObjectAnimator.ofFloat(tasarim.resim,"scaleY",0.0f,3.0f)

        val coklu = AnimatorSet().apply { //
            duration = 1000  //
            playTogether(a,sX,sY)  // hepsini aynı anda uygular
        }
        coklu.start()
    }

    fun tekrarOzelligi(){  //
        val r = ObjectAnimator.ofFloat(tasarim.resim,"translationY",0.0f,85.0f).apply { //
            duration = 1000  //
            repeatCount = ObjectAnimator.INFINITE  // sonsuza kadar
            repeatMode = ObjectAnimator.REVERSE // bulunduğu konumdan işleme devam eder   // ObjectAnimator.RESTART -> konuma geri dönüp işleme devam eder
        }
        r.start()
    }

    fun ivmeOzelligi(){  //
        val r = ObjectAnimator.ofFloat(tasarim.resim,"translationY",0.0f,85.0f).apply { //
            duration = 1000  //
            interpolator = OvershootInterpolator() // -> geri gidip durma gibi   // BounceInterpolator() -> sekme gibi
        }
        r.start()
    }

    fun gecikmeOzelligi(){  //
        val r = ObjectAnimator.ofFloat(tasarim.resim,"translationY",0.0f,85.0f).apply { //
            duration = 1000  //
            startDelay = 2000 // 2 saniye gecikme
        }
        r.start()
    }

    fun resimSoldanEkranaGirisAnimasyonu(){  //
        val r = ObjectAnimator.ofFloat(tasarim.resim,"translationX",-800.0f,0.0f).apply { //
            duration = 1000  // 1 saniye
        }
        r.start()
    }

    fun yaziSagdanEkranaGirisAnimasyonu(){  //
        val r = ObjectAnimator.ofFloat(tasarim.yazi,"translationX",800.0f,0.0f).apply {
            duration = 1000  // 1 saniye
        }
        r.start()
    }

    fun buttonAsagıdanEkranaGirisAnimasyonu(){  //
        val r = ObjectAnimator.ofFloat(tasarim.button,"translationY",800.0f,0.0f).apply {
            duration = 1000  // 1 saniye
        }
        r.start()
    }

    fun translationAnimasyonu(){  //translation = haraket ettirme
        val t = ObjectAnimator.ofFloat(tasarim.yazi,"translationX",0.0f,100.0f).apply { //translationY || translationX
            duration = 2000  // 2 saniye
        }
        t.start()
    }

    fun rotateAnimasyonu(){  //rotate = döndürme
        val s = ObjectAnimator.ofFloat(tasarim.resim,"scaleX",1.0f,2.0f).apply { // 0.0, 45.0 90.0 ... 360.0
            duration = 4000  // 4 saniye
        }
        s.start()
    }

    fun scaleAnimasyonu(){  //scale = boyut arttırma azaltma
        val s = ObjectAnimator.ofFloat(tasarim.resim,"scaleX",1.0f,2.0f).apply { // scaleX = yatayda, scaleY = dikeyde
            duration = 4000  // 4 saniye
        }
        s.start()
    }


    fun alphaAnimasyonu(){ //alpha = saydamlaştırma
        val a = ObjectAnimator.ofFloat(tasarim.resim,"alpha",1.0f,0.2f).apply { // 1.0f ile 0.0f arası değer alabilir
            duration = 4000  // 4 saniye
        }
        a.start()
    }

}